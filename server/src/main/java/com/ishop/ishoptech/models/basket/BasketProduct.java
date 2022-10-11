package com.ishop.ishoptech.models.basket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ishop.ishoptech.models.BaseEntity;
import com.ishop.ishoptech.models.product.Product;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Table
@Entity(name = "basket_product")
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
public class BasketProduct extends BaseEntity {

    private Integer amount;
    private Integer price;

    @ToString.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "idBasket")
    private Basket basket;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idProduct")
    private Product product;


}
