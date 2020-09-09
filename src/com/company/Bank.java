package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<String> branches;

    public Bank(String name) {
        this.name = name;
    }

    public static void createBank(String name){
        Bank bank = new Bank(name);
    }
}
