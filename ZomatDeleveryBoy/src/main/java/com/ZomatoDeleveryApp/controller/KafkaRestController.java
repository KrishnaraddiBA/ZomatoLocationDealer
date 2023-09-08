package com.ZomatoDeleveryApp.controller;

import com.ZomatoDeleveryApp.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class KafkaRestController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/v2")
    public ResponseEntity<?> updateLocation(){
        kafkaService.sendMessage("( "+Math.round(Math.random())+ ","+ Math.round(Math.random())+" )");
        return new ResponseEntity<>("msg updated", HttpStatus.OK);

    }
}
