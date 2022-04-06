package com.kuebikoIt.fakeAlert.dao;

import com.kuebikoIt.fakeAlert.models.AlertInfo;

public interface AlertDao {
    public AlertInfo save(Long accNum);
}
