package com.example.hw2_10.controller;

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
    public List<Integer> addProduct(@RequestParam List<Integer> article) {
        return storeService.addArticle(article);
    }
    @GetMapping("/get")
    public List<Integer> print() {
        return storeService.getBasket();
    }
}
