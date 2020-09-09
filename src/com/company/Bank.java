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

    public ArrayList<Branch> getBranches() {

        return branches;
    }
}
