package com.study.service.impl;

import com.study.service.CountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CountServiceImpl implements CountService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String count() {
        Long increment = stringRedisTemplate.opsForValue().increment("count-people");
        return "有[" + increment + "]人访问了这个页面";
    }
}
