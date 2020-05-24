package com.value.serviceDown.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceClass {
    public RestTemplate restTemplate=new RestTemplate();

    public String calldeadservice(){
        String result=restTemplate.getForObject("http://localhost:8081/health/check", String.class);
        System.out.println(result);
        return "success";
    }
}
