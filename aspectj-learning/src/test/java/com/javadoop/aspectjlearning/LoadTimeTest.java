package com.javadoop.aspectjlearning;

import org.junit.Test;

import com.javadoop.aspectjlearning.model.Account;

/**
 * @author: hongjie
 * @date: 2018/7/3
 */

public class LoadTimeTest {


//    @Test
    public void ltw() {
        Account account = new Account();
        account.pay(100);
    }
}
