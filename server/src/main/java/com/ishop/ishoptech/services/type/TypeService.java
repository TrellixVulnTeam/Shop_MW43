package com.ishop.ishoptech.services.type;

import com.ishop.ishoptech.models.type.Type;
import com.ishop.ishoptech.repository.type.TypeJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    private final TypeJPA typeJPA;

    @Autowired
    public TypeService(TypeJPA typeJPA) {
        this.typeJPA = typeJPA;
    }

    public List<Type> findAll() {
        return this.typeJPA.findAll();
    }

}
