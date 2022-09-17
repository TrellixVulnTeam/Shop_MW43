package com.ishop.ishoptech.repository.type;

import com.ishop.ishoptech.models.type.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeJPA extends JpaRepository<Type, Long> {
}
