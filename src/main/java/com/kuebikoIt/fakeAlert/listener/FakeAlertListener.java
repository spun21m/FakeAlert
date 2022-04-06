package com.kuebikoIt.fakeAlert.listener;

import com.kuebikoIt.fakeAlert.dto.AlertEntity;
import com.kuebikoIt.fakeAlert.models.AlertInfo;
import com.kuebikoIt.fakeAlert.repo.AlertRepo;
import com.kuebikoIt.fakeAlert.service.AlertService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FakeAlertListener {

    @Autowired
    AlertRepo alertRepo;


    @KafkaListener(topics = "FAKE-BANK-ALERTS-TOPIC", groupId = "foo")
    public void listenGroupId(String message){
        System.out.println("Received message in group Id: " + message);

        String accNum = message.substring(47, message.indexOf("in")-1);
        AlertEntity alertEntity = new AlertEntity();
        alertEntity.setAlert_message(message);
        alertEntity.setAcc_Num(Long.valueOf(accNum));

        alertRepo.save(alertEntity);

    }
}
