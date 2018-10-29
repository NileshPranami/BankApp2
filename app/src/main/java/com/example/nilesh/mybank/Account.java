package com.example.nilesh.mybank;

public class Account {
    void openAccount(Bank b){
        b.createAccount();
        b.withdraw();
        b.deposit();
        b.checkBalance();
    }
}
