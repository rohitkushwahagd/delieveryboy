package com.delieveryboy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.delieveryboy.service.KafkaService;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        this.kafkaService.updateLocation("(" + Math.round(Math.random()*100)+ " , " + Math.round(Math.random()*100) + ")");

        return new ResponseEntity<>(Map.of("Message","updated"), HttpStatus.OK);

    }
}
