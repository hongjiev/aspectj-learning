package com.javadoop.aspectjlearning.aspect;

import com.javadoop.aspectjlearning.share.model.User;

public aspect UserAspect {

    pointcut callPay(int amount, User account):
            call(boolean com.javadoop.aspectjlearning.share.model.User.pay(int)) && args(amount) && target(account);

    before(int amount, User account): callPay(amount, account) {
        System.out.println("[UserAspect]付款前总金额: " + account.balance);
        System.out.println("[UserAspect]需要付款: " + amount);
    }

    boolean around(int amount, User account): callPay(amount, account) {
        if (account.balance < amount) {
            System.out.println("[UserAspect]拒绝付款!");
            return false;
        }
        return proceed(amount, account);
    }

    after(int amount, User balance): callPay(amount, balance) {
        System.out.println("[UserAspect]付款后，剩余：" + balance.balance);
    }

}
