package com.ishop.ishoptech.dao.product;

import com.ishop.ishoptech.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProductJPA extends JpaRepository<Product, Long> {
}
