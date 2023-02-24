package com.tencent.myselfdemo.kafka;

import static com.tencent.myselfdemo.kafka.KafkaConstant.TOPIC_NAME;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = TOPIC_NAME,groupId = "default-group")
    public void consume1(ConsumerRecord<String,String> record, Acknowledgment ack) {
        String topic = record.topic();
        String key = record.key();
        String value = record.value();

        log.info("消费的消息 topic:{},key:{},value:{}",topic,key,value);

        ack.acknowledge();
    }
}
