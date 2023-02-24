package com.tencent.myselfdemo.kafka;

import static com.tencent.myselfdemo.kafka.KafkaConstant.TOPIC_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    private MyKafkaProducerSendResultListener myKafkaProducerSendResultListener;

    public void sendMsg(String topic,String message) {
        kafkaTemplate.setProducerListener(myKafkaProducerSendResultListener);

        kafkaTemplate.send(topic,message.hashCode() +"",message);
    }
}
