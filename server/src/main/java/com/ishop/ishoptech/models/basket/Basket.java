package com.ishop.ishoptech.models.basket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ishop.ishoptech.models.BaseEntity;
import com.ishop.ishoptech.models.user.User;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity(name = "basket")
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
public class Basket extends BaseEntity {

    @ToString.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idUser")
    private User user;

    @JsonProperty(value = "basketProducts")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idBasket")
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<BasketProduct> basketProducts;

    public List<BasketProduct> getBasketProducts() {
        return this.basketProducts == null ? new ArrayList<>() : this.basketProducts;
    }

    public void setBasketProduct(BasketProduct basketProducts) {
        if (this.basketProducts == null) {
            this.basketProducts = List.of(basketProducts);
        } else {
            this.basketProducts.add(basketProducts);
        }
    }
    public Basket addToBasketProducts(BasketProduct basketProduct) {
        this.getBasketProducts().add(basketProduct);
        return this;
    }
}
