package com.ishop.ishoptech.controllers.basket;

import com.ishop.ishoptech.models.basket.Basket;
import com.ishop.ishoptech.services.basket.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/user/{id}")
    public Basket findBasketByUserId(@PathVariable String id) {
        return this.basketService.findByUserId(Long.valueOf(id));
    }

}
