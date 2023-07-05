package com.example.hw2_10.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private List<Integer> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public List<Integer> add(List<Integer> article){
        basket.addAll(article);
        return basket;

    }
    public List<Integer> get() {
        return basket;
    }
}
