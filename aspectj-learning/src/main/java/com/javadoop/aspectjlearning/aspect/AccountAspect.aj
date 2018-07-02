package com.javadoop.aspectjlearning.aspect;

import com.javadoop.aspectjlearning.model.Account;

public aspect AccountAspect {

    pointcut callPay(int amount, Account account):
            call(boolean com.javadoop.aspectjlearning.model.Account.pay(int)) && args(amount) && target(account);

    before(int amount, Account account): callPay(amount, account) {
        System.out.println("[AccountAspect]付款前总金额: " + account.balance);
        System.out.println("[AccountAspect]需要付款: " + amount);
    }

    boolean around(int amount, Account account): callPay(amount, account) {
        if (account.balance < amount) {
            System.out.println("[AccountAspect]拒绝付款!");
            return false;
        }
        return proceed(amount, account);
    }

    after(int amount, Account balance): callPay(amount, balance) {
        System.out.println("[AccountAspect]付款后，剩余：" + balance.balance);
    }

}
