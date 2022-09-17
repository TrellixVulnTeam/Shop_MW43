package com.ishop.ishoptech.services.chipset;

import com.ishop.ishoptech.models.chipset.Chipset;
import com.ishop.ishoptech.repository.chipset.ChipsetJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChipsetService {

    private final ChipsetJPA chipsetJPA;

    @Autowired
    public ChipsetService(ChipsetJPA chipsetJPA) {
        this.chipsetJPA = chipsetJPA;
    }

    public List<Chipset> findAll(){
        return chipsetJPA.findAll();
    }
}
