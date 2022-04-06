package com.kuebikoIt.fakeAlert.repo;

import com.kuebikoIt.fakeAlert.dto.AlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepo extends JpaRepository<AlertEntity, Long> {
    @Query(
            value = "SELECT * FROM ALERT_ENTITY WHERE ACC_NUM=?1",
            nativeQuery = true)
    public AlertEntity findByAccNum(Long accNum);
}
