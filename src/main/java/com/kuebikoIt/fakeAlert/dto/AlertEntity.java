package com.kuebikoIt.fakeAlert.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlertEntity {
    @Id
    private Long acc_Num;

    @Column
    private String alert_message;

    public Long getAcc_Num() {
        return acc_Num;
    }

    public void setAcc_Num(Long acc_Num) {
        this.acc_Num = acc_Num;
    }

    public String getAlert_message() {
        return alert_message;
    }

    public void setAlert_message(String alert_message) {
        this.alert_message = alert_message;
    }
}
