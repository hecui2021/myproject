package com.study.config;

import com.study.pojo.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author peterche
 * @Description
 * @Date 2023/3/23 11:37
 **/
@Configuration
public class BeanConfig {

    @Bean
    public Config config2(){
        return new Config();
    }

}
