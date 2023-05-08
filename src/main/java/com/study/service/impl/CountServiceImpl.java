package com.study.service.impl;

import com.study.service.CountService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CountServiceImpl implements CountService {

    @Autowired
    private RedisClient redisClient;

    @Override
    public String count() {
        return "有[]人访问了这个页面";
    }
}
