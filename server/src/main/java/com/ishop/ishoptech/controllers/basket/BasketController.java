package com.ishop.ishoptech.controllers.basket;

import com.ishop.ishoptech.dto.basket.AddToBasketDto;
import com.ishop.ishoptech.dto.jwt.JWTDto;
import com.ishop.ishoptech.models.basket.Basket;
import com.ishop.ishoptech.models.basket.BasketProduct;
import com.ishop.ishoptech.models.product.Product;
import com.ishop.ishoptech.security.jwt.provider.JwtTokenProvider;
import com.ishop.ishoptech.security.user.Impl.UserServiceImpl;
import com.ishop.ishoptech.services.basket.BasketService;
import com.ishop.ishoptech.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/basket")
public class BasketController {

    private final BasketService basketService;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserServiceImpl userService;
    private final ProductService productService;

    @Autowired
    public BasketController(BasketService basketService, JwtTokenProvider jwtTokenProvider, UserServiceImpl userService, ProductService productService) {
        this.basketService = basketService;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping("/user/{token}")
    public Basket findBasketByUserId(@PathVariable String token) {
        return this.basketService.findByUserId(userService.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(token))).getId());
    }

    @PostMapping("/user/addProduct")
    public ResponseEntity<ResponseStatus> addProduct(@RequestBody AddToBasketDto addToBasketDto) {
        Basket basket = basketService.findByUserId(userService.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(addToBasketDto.getToken()))).getId());
        if(basket == null) {
            basket = basketService.save(new Basket().withUser(userService.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(addToBasketDto.getToken())))));
        }
        Product product = productService.findById(Long.valueOf(addToBasketDto.getIdProduct()));
        BasketProduct basketProduct = new BasketProduct().withAmount(Integer.parseInt(addToBasketDto.getAmount())).withProduct(product).withBasket(basket).withPrice(Integer.parseInt(addToBasketDto.getAmount()) * product.getPrice().intValue());
        basket.setBasketProduct(basketProduct);
        try {
            basketService.save(basket);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/user/clearBasket", method=RequestMethod.DELETE)
    @ResponseBody
    public void clearBasket(@RequestBody JWTDto tokenDto) {
        this.basketService.clear(basketService.findByUserId(userService.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(tokenDto.getToken()))).getId()));
    }

}
