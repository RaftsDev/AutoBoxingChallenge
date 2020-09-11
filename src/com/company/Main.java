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
import java.util.Scanner;

public class Main {

    //private static Scanner scanner = new Scanner(System.in);



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

        /*bank.addCustomer(westernBranch,"Bob",100.00);
        bank.addCustomer(westernBranch,"Mike",70.00);
        bank.addCustomer(southernBranch,"Tom",50.00);
        bank.addCustomer(southernBranch,"Bill",30.00);*/
        //Validation fake initial amount
        //bank.addCustomer(southernBranch, "Donald", 0);

        //Additional transactions

        addTransaction(westernBranch,"Bob", -70.00);
        addTransaction(westernBranch,"Mike", -55.00);
        //Validation fake customer
        addTransaction(westernBranch,"Tom", -50.00);


        printBranchCustomers(westernBranch);
        printBranchCustomers(southernBranch);

        // Add Customers to branches

       /* westernBranch.addCustomer(Bob);
        southernBranch.addCustomer(Tom);
        westernBranch.addCustomer(Mike);
        southernBranch.addCustomer(Bill);
*/

        //Print customers and transactions

      /*  printBranchCustomers(westernBranch);
        printBranchCustomers(southernBranch);*/

        // Add transactions

       /* Bob.addTransaction(bobDeposit);
        Bob.addTransaction(bobCharge);*/


        /*
        boolean quit = false;
        while(!quit){

            int action = printOptions();
            //System.out.println("action:"+action);

            switch(action){
                case 0://create a Branch
                    System.out.println("You want to create a branch\n" +
                            "type the name of branch:");
                    String name = scanner.nextLine();
                    Branch branchName = Branch.createBranch(name, bankName);
                    bankName.addBranch(branchName);
                    break;
                case 1://create a Customer
                    System.out.println("You want to create a customer\n" +
                            "type the name of customer:");
                    name = scanner.nextLine();
                    System.out.println("Type the name of branch:");
                    String tempBranchName = scanner.nextLine();


                    break;
                case 2:
                    System.out.println("You pressed 2");
                    break;
                case 3://Show branches
                    System.out.println("You branches:");
                    ArrayList<Branch> branches = bankName.getBranches();
                    //System.out.println("toString:"+branches.get(0).getName());
                    for (int i = 0; i < branches.size(); i++){
                        System.out.println(i+": "+branches.get(i).getName());
                    }
                    break;
                case 4:
                    System.out.println("You pressed 4");
                    break;
                case 5:
                    System.out.println("You pressed 5");
                    break;
                case 6:
                    System.out.println("You pressed 6");
                    quit = true;
                    break;
            }


        }
    }

    private static int printOptions(){
        System.out.println("----------- List of available options --------");
        System.out.println("0 - create a Branch\n" +
                "1 - create a Customer\n" +
                "2 - create a Transaction of customer\n" +
                "3 - Show a Branches\n" +
                "4 - Show a Customers of Branch\n"+
                "5 - Show a Customers of Branch w transactions\n"+
                "6 - Exit of application");

        int action = scanner.nextInt();
        scanner.nextLine();
        return action;

         */
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
