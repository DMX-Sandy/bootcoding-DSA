package com.bootcoding.oops;

import java.util.Random;

public class BankBalance {
    public static void main(String[] args) {


        Bank bank=new Bank();
        bank.name="Bank of maharastra";
        bank.balance=70000.00;
        bank.AccountId=new Random().nextInt();

        Customer customer=new Customer();
        customer.name="Prathmesh";
        customer.city="Nagpur";
        customer.phone=7498771237l;
        customer.bank=bank;


        System.out.println("Customer name "+customer.name);
        System.out.println("Customer city "+customer.city);
        System.out.println("customer phone "+customer.phone);
        System.out.println("Bank name "+customer.bank.name);
        System.out.println("AccountId "+customer.bank.AccountId);
        System.out.println("Bank balance "+customer.bank.balance);


    }
}
