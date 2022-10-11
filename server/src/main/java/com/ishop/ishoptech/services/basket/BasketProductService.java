package com.ishop.ishoptech.services.basket;

import com.ishop.ishoptech.models.basket.Basket;
import com.ishop.ishoptech.models.basket.BasketProduct;
import com.ishop.ishoptech.repository.basket.BasketProductJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketProductService {

    private final BasketProductJPA basketProductJPA;

    @Autowired
    public BasketProductService(BasketProductJPA basketProductJPA) {
        this.basketProductJPA = basketProductJPA;
    }


    public void addByBasket(BasketProduct basketProduct) {
        basketProductJPA.save(basketProduct);
    }
    public void removeByBasket(Basket basket) {
        basketProductJPA.deleteAllByBasketId(basket.getId());
    }

}
