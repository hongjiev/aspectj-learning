package com.javadoop.aspectjlearning.share.model;

public class User {

    public int balance = 20;

    public boolean pay(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
