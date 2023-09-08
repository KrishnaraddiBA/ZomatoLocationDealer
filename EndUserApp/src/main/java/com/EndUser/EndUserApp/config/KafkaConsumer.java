package com.EndUser.EndUserApp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "keshav",groupId = "group-1")
    public void reveciveMsg(String location){
System.out.println(location);
logger.info("msg recieved!!!!");
    }

}
