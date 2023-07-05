package com.example.hw2_10.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private Basket basket;

    StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addArticle(List<Integer> article) {
        return basket.add(article);
    }

    @Override
    public List<Integer> getBasket() {
       return basket.get();
    }
}
