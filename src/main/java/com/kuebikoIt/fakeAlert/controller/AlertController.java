package com.kuebikoIt.fakeAlert.controller;

import com.kuebikoIt.fakeAlert.models.AlertInfo;
import com.kuebikoIt.fakeAlert.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerts")
public class AlertController {

    @Autowired
    AlertService alertService;

    @RequestMapping(value = "/acc-alert", method = RequestMethod.GET)
    public AlertInfo getAlert(@RequestParam Long accNum){
        AlertInfo response = alertService.saveAlert(accNum);

        return response;
    }
}
