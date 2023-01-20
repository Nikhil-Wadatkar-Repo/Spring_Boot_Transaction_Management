package com.nt.SpringTxMgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MyRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void createTable() {


        jdbcTemplate.update("Insert into SYSTEM.EMP_DEPT (DEPT_ID,EMP_ID,DEPARTMENT,CITY,PINCODE) values (21,206,'DEVELOPER','DELHI',258988)");
        System.out.println("row 1 inserted");
        jdbcTemplate.execute("Insert into SYSTEM.EMP_DEPT (DEPT_ID,EMP_ID,DEPARTMENT,CITY,PINCODE) values (22,202,'SALES','hYDERABAD',546656)");
        System.out.println("row 2 inserted");
        int num = 100 / 0;
        jdbcTemplate.execute("Insert into SYSTEM.EMP_DEPT (DEPT_ID,EMP_ID,DEPARTMENT,CITY,PINCODE) values (23,205,'DEVELOPER','AMRAWATI',444901)");
        System.out.println("row 3 inserted");
    }
}
