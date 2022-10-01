package com.ishop.ishoptech.repository.basket;

import com.ishop.ishoptech.models.basket.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketJPA extends JpaRepository<Basket, Long> {

    Basket findByUserId(Long idUser);

}
