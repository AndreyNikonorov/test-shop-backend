package ru.extyl.testshopbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.extyl.testshopbackend.service.ShopService;

@RestController
public class ShopController {

    private final ShopService storeService;

    public ShopController(ShopService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/catalog/")
    String getCatalog() {
        return storeService.getCatalog();
    }

    @GetMapping("/catalog/{categoryCode}")
    String getCategory(@PathVariable("categoryCode") String categoryCode) {
        return storeService.getCategory(categoryCode);
    }

    @GetMapping("/catalog/{categoryCode}/{productCode}")
    String getProduct(@PathVariable("categoryCode") String categoryCode,
                      @PathVariable("productCode") String productCode) {
        return storeService.getProduct(productCode);
    }
}

