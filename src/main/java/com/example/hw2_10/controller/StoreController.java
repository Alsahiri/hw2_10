package com.example.hw2_10.controller;

import com.example.hw2_10.service.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.hw2_10.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public String addProduct(@RequestParam String id) {
        storeService.addArticle(id);
        return "Товар добавлен в корзину";
    }
    @GetMapping("/get")
    public List<Product> print() {
        return storeService.showBasket();
    }
}
