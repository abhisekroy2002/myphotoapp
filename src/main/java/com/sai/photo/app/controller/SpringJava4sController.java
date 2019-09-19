package com.sai.photo.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.photo.model.Customer;

@RestController
public class SpringJava4sController {
	@PostMapping(path = "/save-cust-info")
    public String customerInformation(@RequestBody Customer cust) {

        /* You can write your DAO logic here.
         * For time being I am printing the customer data just to show the POST call is working.
         */

        return "Customer information saved successfully ::." + cust.getCustNo() + " " + cust.getName() + " " + cust.getCountry();
    }
}
