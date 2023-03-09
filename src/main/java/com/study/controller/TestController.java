package com.study.controller;

import com.study.kafka.KafkaProducer;
import com.study.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/sendMsg")
    public String sendMsg(@RequestParam("msg") String msg) {
        log.info("start:{}",msg);
        producer.sendMsg("",msg);
        return "success";
    }


    @RequestMapping("/mvData")
    public String mvData(){
        testService.mvData();

        return "success";
    }

}
