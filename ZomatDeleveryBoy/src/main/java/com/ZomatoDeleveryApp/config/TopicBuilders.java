package com.ZomatoDeleveryApp.config;

import org.apache.kafka.clients.admin.NewTopic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicBuilders {

    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name("keshav")
//                .partitions()
//                .replicas()
                .build();
    }
}
