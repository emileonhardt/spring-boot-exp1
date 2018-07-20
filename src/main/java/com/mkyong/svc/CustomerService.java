package com.mkyong.svc;

import com.mkyong.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.ManagedBean;

@ManagedBean
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public long countCustomers() {
        return customerRepository.findAllAndStream().count();
    }

}
