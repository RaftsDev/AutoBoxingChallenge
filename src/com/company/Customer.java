package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public Customer createCustomer(String name){
        return new Customer(name);
    }
}
