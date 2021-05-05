package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/api/v1/")
public class ServiceController {


    /**
     * To get the property values
     */
    @Value("${app.validationConfirmationMessage}")
    private String validationConfirmationMessage;


    @GetMapping("data")
    public String getSensitiveData() {

        return validationConfirmationMessage;
    }
}
