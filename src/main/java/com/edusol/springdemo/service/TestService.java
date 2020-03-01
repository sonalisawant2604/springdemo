package com.edusol.springdemo.service;

import com.edusol.springdemo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TestService
{

    public List<Customer> getHelloWorld()
    {
        log.info("inside service");
        log.info("getting customer data");
        List<Customer> l=new ArrayList<>();

        l.add(new Customer(1,"sonali","pune"));
        l.add(new Customer(2,"pari","pune"));
        l.add(new Customer(3,"ananya","nashik"));
        return l;
    }
}
