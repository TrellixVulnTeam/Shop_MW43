package com.ishop.ishoptech.services.basket;

import com.ishop.ishoptech.models.basket.Basket;
import com.ishop.ishoptech.repository.basket.BasketJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {

    private final BasketJPA basketJPA;

    @Autowired
    public BasketService(BasketJPA basketJPA) {
        this.basketJPA = basketJPA;
    }

    public Basket findByUserId(Long idUser) {
        return this.basketJPA.findByUserId(idUser);
    }

}
