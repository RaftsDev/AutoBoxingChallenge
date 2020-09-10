package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private Bank bankName;
    private ArrayList<Customer> customers;

    public Branch(String name, Bank bankName) {
        this.name = name;
        this.bankName = bankName;
    }

    public static Branch createBranch(String name, Bank bankName){
        return new Branch(name, bankName);
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
