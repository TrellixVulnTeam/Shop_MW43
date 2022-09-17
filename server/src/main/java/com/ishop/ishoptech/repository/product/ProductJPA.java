package com.ishop.ishoptech.repository.product;

import com.ishop.ishoptech.models.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJPA extends JpaRepository<Product, Long> {
}
