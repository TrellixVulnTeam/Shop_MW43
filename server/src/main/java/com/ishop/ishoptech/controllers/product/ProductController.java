package com.ishop.ishoptech.controllers.product;

import com.ishop.ishoptech.models.product.Product;
import com.ishop.ishoptech.models.type.Type;
import com.ishop.ishoptech.services.image.ImageService;
import com.ishop.ishoptech.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.save(product);
    }

    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id) {
        return this.productService.findById(Long.valueOf(id));
    }

    @GetMapping("/products")
    public List<Product> productsAll() {
        return productService.findAll();
    }

    @GetMapping("/products/type/{typeId}")
    public List<Product> productByType(@PathVariable String typeId) {
        return this.productService.findByTypeId(Long.valueOf(typeId));
    }
}
