package com.tencent.myselfdemo.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LandLoad implements LandLoadService{

    @Override
    public void send(String name) {
        log.info("send name:{}",name);
    }

}
