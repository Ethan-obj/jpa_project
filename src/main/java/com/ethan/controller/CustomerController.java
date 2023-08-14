package com.ethan.controller;

import com.ethan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Ethan
 * @version 1.0
 * @date 2023/08/13/ 17:47
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("/test/query")
    public ResponseEntity<?> testQuery() {
        customerService.testQuery();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/test/query1")
    public ResponseEntity<?> testQuery1() {
        customerService.testQuery1();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/test/testAdd")
    public ResponseEntity<?> testAdd() {
        customerService.testCascadeAdd();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/test/testTransaction")
    public ResponseEntity<?> testTransaction() {
        customerService.testTransaction();
        return ResponseEntity.ok().build();
    }
}
