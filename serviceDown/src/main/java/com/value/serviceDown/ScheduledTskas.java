package com.value.serviceDown;

import com.value.serviceDown.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTskas {
    @Autowired
    private ServiceClass service;
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    @Scheduled(fixedRate = 10000)
    public void scheduleTaskWithFixedRate() {
    System.out.println("hi im running after :"+ dateTimeFormatter.format(LocalDateTime.now()));
    String result=service.calldeadservice();
        System.out.println(result);

}

}
