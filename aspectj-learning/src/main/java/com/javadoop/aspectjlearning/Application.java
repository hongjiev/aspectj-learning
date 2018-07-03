package com.javadoop.aspectjlearning;


import com.javadoop.aspectjlearning.model.Account;
import com.javadoop.aspectjlearning.share.model.User;

public class Application {

    /**
     * 在测试时，请先修改 pom.xml 文件中的内容，放开相应的注释
     * 不要用 IDE 跑，用命令行：
     *      1. mvn clean package
     *      2. java -jar target/aspectj-learning-1.0-jar-with-dependencies.jar
     * 碰到你解决不了的问题，可以尝试到 https://www.javadoop.com/post/aspectj 留言
     */
    public static void main(String[] args) {

//        testCompileTime();
//        testPostCompile();
//        testLoadTime();
        
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
