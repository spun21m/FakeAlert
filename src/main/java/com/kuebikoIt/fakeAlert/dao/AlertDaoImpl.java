package com.kuebikoIt.fakeAlert.dao;

import com.kuebikoIt.fakeAlert.dto.AlertEntity;
import com.kuebikoIt.fakeAlert.models.AlertInfo;
import com.kuebikoIt.fakeAlert.repo.AlertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AlertDaoImpl implements AlertDao{

    @Autowired
    AlertRepo alertRepo;

    @Override
    public AlertInfo save(Long accNum) {

        AlertEntity dataFromRepo = alertRepo.findByAccNum(accNum);

        AlertInfo response = new AlertInfo();
        if (dataFromRepo != null){
            response.setAccNum(dataFromRepo.getAcc_Num());
            response.setMessage(dataFromRepo.getAlert_message());
        }
        else {
            response.setAccNum(accNum);
            response.setMessage("Account number does not exist!");

        }
        return response;
    }
}
