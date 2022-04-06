package com.kuebikoIt.fakeAlert.service;

import com.kuebikoIt.fakeAlert.dao.AlertDao;
import com.kuebikoIt.fakeAlert.models.AlertInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertServiceImpl implements AlertService{

    @Autowired
    AlertDao alertDao;

    @Override
    public AlertInfo saveAlert(Long accNum) {

        return alertDao.save(accNum);
    }
}
