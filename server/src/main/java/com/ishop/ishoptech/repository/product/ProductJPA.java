package com.ishop.ishoptech.repository.product;

import com.ishop.ishoptech.models.product.Product;
import com.ishop.ishoptech.models.type.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductJPA extends JpaRepository<Product, Long> {

    public List<Product> findByTypeId(Long typeId);

}
