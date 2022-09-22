package com.ishop.ishoptech.services.product;

import com.ishop.ishoptech.models.product.Product;
import com.ishop.ishoptech.models.type.Type;
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

    public Product save(Product product) {
        return this.productJPA.save(product);
    }

    public Product findById(Long id) {
        return this.productJPA.findById(id).orElse(null);
    }

    public List<Product> findByTypeId(Long typeId) {
        return this.productJPA.findByTypeId(typeId);
    }

    public List<Product> findAll() {
        return this.productJPA.findAll();
    }

}
