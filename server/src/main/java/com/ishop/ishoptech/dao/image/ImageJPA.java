package com.ishop.ishoptech.dao.image;

import com.ishop.ishoptech.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageJPA extends JpaRepository<Image, Long> {
}
