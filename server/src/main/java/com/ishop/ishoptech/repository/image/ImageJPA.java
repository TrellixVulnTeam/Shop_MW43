package com.ishop.ishoptech.repository.image;

import com.ishop.ishoptech.models.image.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageJPA extends JpaRepository<Image, Long> {
}
