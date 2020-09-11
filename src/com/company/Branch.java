package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, Bank bankName) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
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

    public boolean addTransaction(String name, double amount){
        Customer customer = findCustomer(name);
        if(!(customer == null)){
            customer.addTransaction(amount);
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(int i = 0; i < this.getCustomers().size(); i++){
            Customer currentCustomer = this.getCustomers().get(i);
            if (currentCustomer.getName().equals(name)){
                return currentCustomer;
            }
        }
        return null;
    }

}
