package com.company;

// You job is to create a simple banking application.
// There should be a com.company.Bank class
// It should have an arraylist of Branches
// Each com.company.Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// com.company.Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// com.company.Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bank bank = Bank.createBank("Nice bank");

        //Create branches & customers

        Branch westernBranch = new Branch("Western branch", bank);
        Branch southernBranch = new Branch("Southern branch", bank);

        bank.addBranch(westernBranch);
        bank.addBranch(southernBranch);

        printBranches(bank);

        //Initial transactions

        addCustomer(bank, westernBranch, "Bob", 100);
        addCustomer(bank, westernBranch, "Mike", 70);
        addCustomer(bank, southernBranch, "Tom", 50);
        addCustomer(bank, southernBranch, "Bill", 30);

        //Validation fake initial amount
        addCustomer(bank, westernBranch, "Donald", 0);

        //Additional transactions

        addTransaction(westernBranch,"Bob", -70.00);
        addTransaction(westernBranch,"Mike", -55.00);

        //Validation fake customer
        addTransaction(westernBranch,"Tom", -50.00);


        printBranchCustomers(westernBranch);
        printBranchCustomers(southernBranch);

    }

    public static void printBranches(Bank bank){
        System.out.println("Bank "+bank.getName()+" has branches:");
        for (int i=0; i<bank.getBranches().size(); i++){
            System.out.println(bank.getBranches().get(i).getName());
        }
    }

    public static void printBranchCustomers(Branch branch){

        System.out.println("Customers of Western:");

        for (int i=0; i<branch.getCustomers().size(); i++){
            Customer currentCustomer = branch.getCustomers().get(i);
            System.out.println("------ Transactions -----");
            System.out.println(currentCustomer.getName());
            //Print transactions each customer

            if(currentCustomer.getTransactions().size()>0){
                for (int j=0; j<currentCustomer.getTransactions().size(); j++){
                    System.out.println("       "+currentCustomer.getTransactions().get(j));
                }
            }

            System.out.println("------------------------");
        }
    }

    private static void addCustomer(Bank bank, Branch branch, String name, double amount){
        if(!bank.addCustomer(branch, name, amount)){
            System.out.println("Suppose to put some money mr. "+name);
        }
    }
    private static void addTransaction(Branch branch, String name,double amount){
        if(!branch.addTransaction(name, amount)){
            System.out.println("No customer with this name: "+name);
        };
    }
}
