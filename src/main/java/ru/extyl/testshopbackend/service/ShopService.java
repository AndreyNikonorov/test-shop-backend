package ru.extyl.testshopbackend.service;

import org.springframework.stereotype.Service;

@Service
public class ShopService {

    public String getCatalog() {
        return "catalog";
    }

    public String getProduct(String code) {
        return "Product - " + code;
    }

    public String getCategory(String code) {
        return "Category - " + code;
    }
}


