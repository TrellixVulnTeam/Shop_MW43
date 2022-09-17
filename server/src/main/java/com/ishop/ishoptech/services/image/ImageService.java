package com.ishop.ishoptech.services.image;

import com.ishop.ishoptech.models.image.Image;
import com.ishop.ishoptech.repository.image.ImageJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    private final ImageJPA imageJPA;

    @Autowired
    public ImageService(ImageJPA imageJPA) {
        this.imageJPA = imageJPA;
    }

    public List<Image> findAll() {
        return this.imageJPA.findAll();
    }


}
