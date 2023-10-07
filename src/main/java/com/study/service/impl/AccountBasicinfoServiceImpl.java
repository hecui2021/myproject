package com.study.service.impl;

import com.study.dto.BasicInfoDto;
import com.study.es.model.AccountBasicinfo;
import com.study.es.service.EsService;
import com.study.service.AccountBasicinfoService;
import com.study.util.DateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @Author peterche
 * @Description
 * @Date 2023/9/28 15:40
 **/
@Service
@Slf4j
public class AccountBasicinfoServiceImpl implements AccountBasicinfoService {

    @Autowired
    private EsService esService;

    @Qualifier("es-thread")
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public void batchAddData(String channelId, int sum) {


        int num = 500;

        int count = sum / num;
        for (int i = 0;i<count;i++) {
            threadPoolTaskExecutor.execute(() -> {
                List<AccountBasicinfo> basicinfoList = new ArrayList<>();
                for (int j = 0;j<num;j++) {
                    AccountBasicinfo basicinfo = new AccountBasicinfo();
                    basicinfo.setDeviceid(UUID.randomUUID().toString().replace("-",""));
                    basicinfo.setF_channel(channelId);
                    basicinfo.setRegist_time(DateUtil.getCurrentTime());
                    basicinfo.setDevice_auth_state(j);
                    basicinfoList.add(basicinfo);
                }
                try {
                    boolean wecarCarAcct = esService.bulkAdd("wecar_car_acct", basicinfoList);
                    log.info("batchAddData wecarCarAcct:{},threadId:{}",wecarCarAcct,Thread.currentThread().getId());

//                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Override
    public boolean addData(AccountBasicinfo basicinfo) {
        try {
            return esService.addDoc("wecar_car_acct", null, basicinfo);
        } catch (IOException e) {
            log.error("addData error",e);
        }
        return false;
    }

    @Override
    public List<AccountBasicinfo> selectList(BasicInfoDto dto) {
        List<AccountBasicinfo> basicinfoList = new ArrayList<>();
        try {
            SearchResponse searchResponse = esService.search("wecar_car_acct", "f_channel",
                dto.getChannelIdList().get(0), 0, 100000000);
            SearchHit[] hits = searchResponse.getHits().getHits();
            for(SearchHit hit : hits){
                AccountBasicinfo basicinfo = new AccountBasicinfo();
                basicinfo.set_id(hit.getId());
                // 源文档内容
                Map<String, Object> sourceAsMap = hit.getSourceAsMap();
                basicinfo.setDeviceid((String) sourceAsMap.get("deviceid"));
                basicinfo.setF_channel((String) sourceAsMap.get("f_channel"));
                basicinfo.setRegist_time((String) sourceAsMap.get("regist_time"));
                basicinfoList.add(basicinfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("basicinfoList:{}",basicinfoList.size());
        return basicinfoList;
    }
}
