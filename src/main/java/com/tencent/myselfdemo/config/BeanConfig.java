package com.tencent.myselfdemo.config;

import com.tencent.myselfdemo.pojo.TcProject;
import java.util.Timer;
import java.util.TimerTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class BeanConfig {

    private static Timer timer = new Timer();

    private static long delayTime = 1 * 60 * 1000L;//一分钟后执行

    private static long periodTime = 1  * 60 * 1000L;//一分钟后执行


    @Bean
    public TcProject tcProject(){
        TcProject tcProject = new TcProject();
        tcProject.setProjectId("swdedfrrf");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                log.info("start-------");
                tcProject.setProjectId("rfgtggtgtgtg");
            }
        }, delayTime, periodTime);

//        log.info("end-------");

        return tcProject;
    }

}
