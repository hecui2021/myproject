package com.study.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.study.es.model.AccountBasicinfo;
import com.study.es.service.EsService;
import com.study.mapper.UserMapper;
import com.study.service.DataService;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @Author peterche
 * @Description
 * @Date 2023/10/17 19:26
 **/
@Service
@Slf4j
public class DataServiceImpl implements DataService {

    private static int ES_LENGTH = 10000;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EsService esService;

    @Qualifier("es-thread")
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public void exportFile(String channelId,HttpServletResponse response) {
        log.info("exportFile start...");

        try {
            // 设置excel下载响应头属性
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("es列表", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        } catch (Exception e) {

        }

        List<AccountBasicinfo> basicinfoList = new ArrayList<>();

//        SearchResponse searchResponse = esService.search("wecar_car_acct", "f_channel",
//            "091000", 0, 10000);
//        if (searchResponse.status() != RestStatus.OK) {
//            return;
//        }
//        addDataToList(searchResponse,basicinfoList);
//
//        long sum = searchResponse.getHits().getTotalHits().value;
//        if (sum > ES_LENGTH) {
//            // 数量不止10000，需要多线程分页查询
//            int count = (int) ((sum - ES_LENGTH) / ES_LENGTH);
//            if ((sum - ES_LENGTH) % ES_LENGTH != 0) {
//                count++;
//            }
//            CountDownLatch countDownLatch = new CountDownLatch(count);
//
//            for (int i = 0;i<count;i++) {
//                int from = ES_LENGTH * (i + 1);
//                threadPoolTaskExecutor.execute(() -> {
//                    SearchResponse threadSearchResponse = esService.search("wecar_car_acct", "f_channel",
//                        "091000", from, ES_LENGTH);
//                    if (threadSearchResponse.status() != RestStatus.OK) {
//                        countDownLatch.countDown();
//                        return;
//                    }
//                    addDataToList(threadSearchResponse,basicinfoList);
//                    countDownLatch.countDown();
//                });
//            }
//            try {
//                countDownLatch.await();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        Object[] values = null;
//        SearchResponse searchResponse = esService.searchAfter("wecar_car_acct", "f_channel",
//            "091000", ES_LENGTH, values);
//
//        SearchHit[] hits = searchResponse.getHits().getHits();
//        addDataToList(hits,basicinfoList);
//        values = hits[hits.length-1].getSortValues();
//
//        long sum = searchResponse.getHits().getTotalHits().value;
//        log.info("sum:{}",sum);
//        // 数量不止10000，需要多线程分页查询
//        int count = (int) ((sum - ES_LENGTH) / ES_LENGTH);
//        if ((sum - ES_LENGTH) % ES_LENGTH != 0) {
//            count++;
//        }
//        for (int i = 0;i<99;i++) {
//            searchResponse = esService.searchAfter("wecar_car_acct", "f_channel",
//                "091000", ES_LENGTH, values);
//            hits = searchResponse.getHits().getHits();
//            addDataToList(hits,basicinfoList);
//            values = hits[hits.length-1].getSortValues();
//            log.info("searchAfter i:{}",i);
//        }

        basicinfoList = esService.redoAccountTypeByScroll("wecar_car_acct",
            "f_channel", channelId);

        log.info("select end...");

        try {
            EasyExcel.write(response.getOutputStream())
                .head(AccountBasicinfo.class)
                .excelType(ExcelTypeEnum.XLSX)
                .sheet("集成商列表")
                .doWrite(basicinfoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("exportFile end...");
    }


    private void addDataToList(SearchHit[] hits,List<AccountBasicinfo> basicinfoList) {
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
    }
}
