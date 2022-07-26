package com.ishop.ishoptech.controllers;

import com.ishop.ishoptech.dao.image.ImageJPA;
import com.ishop.ishoptech.dao.product.ProductJPA;
import com.ishop.ishoptech.entities.Image;
import com.ishop.ishoptech.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductJPA productJPA;
    private final ImageJPA imageJPA;

    @Autowired
    public ProductController(ProductJPA productJPA, ImageJPA imageJPA) {
        this.productJPA = productJPA;
        this.imageJPA = imageJPA;
    }

    @GetMapping("/images")
    public List<Image> imagesAll() {
        return imageJPA.findAll();
    }

    @GetMapping("/products")
    public List<Product> productsAll() {
        return productJPA.findAll();
    }

}
