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

public class Main {

    public static void main(String[] args) {

        boolean quit = false;
        while(!quit){
            System.out.println("----------- List of available options --------");
            System.out.println("0 - create a Bank\n" +
                               "1 - create a Branch\n" +
                               "2 - create a Customer\n" +
                               "3 - create a Transaction of customer\n" +
                               "4 - Show a Bank\n" +
                               "5 - Show a Branches\n" +
                               "6 - Show a Customers of Branch\n" +
                               "7 - Show a Customers of Branch w transactions\n" +
                               "8 - Exit of application");
            quit = true;//just for test
        }
    }
}
