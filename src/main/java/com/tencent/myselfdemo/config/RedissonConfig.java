package com.tencent.myselfdemo.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Value("${spring.redis.host}")
    private String redissonHost;
    @Value("${spring.redis.password}")
    private String redissonPassword;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://" + redissonHost + ":6379").setPassword(redissonPassword);
        RedissonClient client = Redisson.create(config);
        return client;
    }
}

