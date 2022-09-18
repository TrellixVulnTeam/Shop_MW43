package com.ishop.ishoptech.controllers.type;

import com.ishop.ishoptech.models.type.Type;
import com.ishop.ishoptech.services.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeController {

    private final TypeService typeService;

    @Autowired
    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }


    @GetMapping("/types")
    public List<Type> getAll() {
        return this.typeService.findAll();
    }


}
