package com.nt.SpringTxMgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRepository myRepository;

    public void createTable() {
        myRepository.createTable();
    }
}
