package com.javadoop.aspectjlearning;


import com.javadoop.aspectjlearning.model.Account;
import com.javadoop.aspectjlearning.share.model.User;

public class Application {

    public static void main(String[] args) {

//        testCompileTime();
//        testPostCompile();
        testLoadTime();
    }


    public static void testCompileTime() {
        Account account = new Account();
        System.out.println("==================");
        account.pay(10);
        account.pay(50);
        System.out.println("==================");
    }

    public static void testPostCompile() {
        User user = new User();
        System.out.println("==================");
        user.pay(10);
        user.pay(50);
        System.out.println("==================");
    }

    public static void testLoadTime() {
        Account account = new Account();
        System.out.println("==================");
        account.pay(10);
        account.pay(50);
        System.out.println("==================");
    }

}
