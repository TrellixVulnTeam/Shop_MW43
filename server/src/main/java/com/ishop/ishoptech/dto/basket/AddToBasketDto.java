package com.ishop.ishoptech.dto.basket;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class AddToBasketDto
{
    private String token;
    private String amount;
    private String idProduct;
}
