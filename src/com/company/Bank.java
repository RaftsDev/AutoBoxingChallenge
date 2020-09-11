package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public static Bank createBank(String name){
        return new Bank(name);
    }

    public void addBranch(Branch branchName){
        this.branches.add(branchName);
    }

    public boolean addCustomer(Branch branchName, String customer, double initialAmount ){
        if(initialAmount<=0){
            return false;
        }
        Customer newCustomer = new Customer(customer, initialAmount);
        branchName.addCustomer(newCustomer);
        return true;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }
}
