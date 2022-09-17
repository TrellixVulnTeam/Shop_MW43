package com.ishop.ishoptech.controllers.product;

import com.ishop.ishoptech.models.image.Image;
import com.ishop.ishoptech.models.product.Product;
import com.ishop.ishoptech.services.image.ImageService;
import com.ishop.ishoptech.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;
    private final ImageService imageService;

    @Autowired
    public ProductController(ProductService productService, ImageService imageService) {
        this.productService = productService;
        this.imageService = imageService;
    }

    @GetMapping("/images")
    public List<Image> imagesAll() {
        return imageService.findAll();
    }

    @GetMapping("/products")
    public List<Product> productsAll() {
        return productService.findAll();
    }

}
