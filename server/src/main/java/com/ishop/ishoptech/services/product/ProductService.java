package com.ishop.ishoptech.services.product;

import com.ishop.ishoptech.models.product.Product;
import com.ishop.ishoptech.repository.product.ProductJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductJPA productJPA;

    @Autowired
    public ProductService(ProductJPA productJPA) {
        this.productJPA = productJPA;
    }

    public List<Product> findAll() {
        return this.productJPA.findAll();
    }

}
