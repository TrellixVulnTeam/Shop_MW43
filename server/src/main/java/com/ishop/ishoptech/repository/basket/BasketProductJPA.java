package com.ishop.ishoptech.repository.basket;

import com.ishop.ishoptech.models.basket.BasketProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BasketProductJPA extends JpaRepository<BasketProduct, Long> {
    @Modifying
    @Transactional
    @Query(value = "delete from basket_product where basket.id = ?1")
    void deleteAllByBasketId(Long basketId);

}
