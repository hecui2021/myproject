package com.study.es.service;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.get.GetResponse;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class EsServiceTest {

    @Autowired
    private EsService esService;

    @Test
    void existsIndex() {
    }

    @Test
    void createIndex() {
    }

    @Test
    void deleteIndex() {
    }

    @Test
    void docExists() {
    }

    @Test
    void addDoc() {
    }

    @Test
    void getDoc() throws IOException {
        log.info("getDoc start");
        GetResponse esTest = esService.getDoc("es_test", "1");
        log.info("getDoc end rsp:{}", JSONObject.toJSONString(esTest));
    }

    @Test
    void bulkAdd() {
    }

    @Test
    void updateDoc() {
    }

    @Test
    void deleteDoc() {
    }

    @Test
    void search() {
    }
}