package com.javadoop.aspectjlearning.model;


public class Account {

    public int balance = 20;

    public boolean pay(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

}
