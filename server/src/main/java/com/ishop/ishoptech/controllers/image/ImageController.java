package com.ishop.ishoptech.controllers.image;

import com.ishop.ishoptech.models.image.Image;
import com.ishop.ishoptech.services.image.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/api")
public class ImageController {

    private final ImageService imageService;


    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/images")
    public List<Image> imagesAll() {
        return imageService.findAll();
    }

}
