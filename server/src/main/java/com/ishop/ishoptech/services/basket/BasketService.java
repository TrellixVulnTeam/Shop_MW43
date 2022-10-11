package com.ishop.ishoptech.services.basket;

import com.ishop.ishoptech.models.basket.Basket;
import com.ishop.ishoptech.repository.basket.BasketJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {

    private final BasketJPA basketJPA;
    private final BasketProductService basketProductService;

    @Autowired
    public BasketService(BasketJPA basketJPA, BasketProductService basketProductService) {
        this.basketJPA = basketJPA;
        this.basketProductService = basketProductService;
    }

    public Basket findByUserId(Long idUser) {
        return this.basketJPA.findByUserId(idUser);
    }

    public Basket save(Basket basket){
        basket.getBasketProducts().forEach(this.basketProductService::addByBasket);
        return this.basketJPA.save(basket);
    }

    public void clear(Basket basket) {
        basketProductService.removeByBasket(basket);
    }

}
