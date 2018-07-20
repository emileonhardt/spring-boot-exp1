package com.mkyong.rs;

import com.mkyong.svc.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRs {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/plus43/{summand}")
    public int plus43(@PathVariable("summand") Integer summand) {
        return 43 + summand;
    }
    @RequestMapping("/")
    public String index() {
        return "Customer count: " + customerService.countCustomers();
    }
}
