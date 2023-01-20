package com.nt.SpringTxMgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService createTable;

    @GetMapping("/createTable")
    public void createTable() {
        createTable.createTable();
    }
}
