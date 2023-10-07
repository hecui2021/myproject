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

    @Override
    public void addData(String channelId, int num) {
        List<AccountBasicinfo> basicinfoList = new ArrayList<>();
        for (int i = 0;i<num;i++) {
            AccountBasicinfo basicinfo = new AccountBasicinfo();
            basicinfo.setDeviceid(UUID.randomUUID().toString().replace("-",""));
            basicinfo.setF_channel(channelId);
            basicinfo.setRegist_time(DateUtil.getCurrentTime());
            basicinfoList.add(basicinfo);
        }
        try {
            esService.bulkAdd("wecar_car_acct",basicinfoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<AccountBasicinfo> selectList(BasicInfoDto dto) {
        List<AccountBasicinfo> basicinfoList = new ArrayList<>();
        try {
            SearchResponse searchResponse = esService.search("wecar_car_acct", "f_channel",
                dto.getChannelIdList().get(0), 0, 10000);
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
        return basicinfoList;
    }
}
