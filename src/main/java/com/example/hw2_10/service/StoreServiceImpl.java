package com.example.hw2_10.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService {
    List<Product> basket = new ArrayList<>();

    @Override
    public void addArticle(String id) {
        Product product = new Product(id);
        basket.add(product);
    }

    @Override
    public List<Product> showBasket() {
        return basket;
    }

}
