package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, Bank bankName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

}
