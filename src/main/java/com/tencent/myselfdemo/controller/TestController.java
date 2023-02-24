package com.tencent.myselfdemo.controller;

import com.tencent.myselfdemo.kafka.KafkaProducer;
import com.tencent.myselfdemo.pojo.TcProject;
import com.tencent.myselfdemo.service.TestService;
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
    private TcProject tcProject;

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
//        String result = testService.mvData();

        log.info("tcProject:{}",tcProject);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("tcProject2:{}",tcProject);

        return "success";
    }

}
