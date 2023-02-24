package com.tencent.myselfdemo;

import com.tencent.myselfdemo.util.CipherUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MyselfdemoApplication {

    public static void main(String[] args) {

//        String skey = "e5ef687062f60497c28d20eb4155b82d";
//        String encrypytext = "vTaRq0dPqX7S31iCpIqJ6pmYiw+0BeadMEHXdkoTSGLCMJS88vKe1dRwPcOgYBmtRuVc41kjZzxKuZE5EqqC0HE0K+nn6NHRxoI+ifmSm7k=";
//        String plaintext = CipherUtil.decrypt(skey, encrypytext);
        SpringApplication.run(MyselfdemoApplication.class, args);


        try {
            int i = 1/0;
            log.info("222");
        } catch (Exception e) {
            log.info("333");
        }
        log.info("111");
    }

}
