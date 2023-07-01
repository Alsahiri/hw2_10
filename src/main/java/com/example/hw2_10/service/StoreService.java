package com.example.hw2_10.service;

import org.springframework.context.annotation.Scope;

import java.util.List;
@Scope(scopeName = "request")
public interface StoreService {
    void addArticle(String id);


    List<Product> showBasket();
}
