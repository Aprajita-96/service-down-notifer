package com.value.deadservice.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/health")
public class Controller implements HealthIndicator {

    @GetMapping("/check")
    public ResponseEntity<String> healthcheck(){
    String status="{\"status\":\"sucess\"}";
    if(checkApplicationHealth()==false)
         status="{\"status\":\"failure\"}";
     String status1="success";
    return new ResponseEntity<>(status1, HttpStatus.OK);

    }

    @Override
    public Health health() {
        if(checkApplicationHealth())
            return Health.up().build();
        else
            return Health.down().build();
    }

    private boolean checkApplicationHealth() {
        return true;
    }
}
