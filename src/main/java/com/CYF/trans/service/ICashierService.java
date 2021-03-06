package com.CYF.trans.service;

import com.igeek.ch07.trans.exception.AccountException;
import com.igeek.ch07.trans.exception.BookStockException;

import java.util.List;

public interface ICashierService {

    //客户的结账
    public void cash(String username, List<Integer> bookIds) throws AccountException, BookStockException;
}