package com.ishop.ishoptech.repository.chipset;

import com.ishop.ishoptech.models.chipset.Chipset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipsetJPA extends JpaRepository<Chipset, Long> {
}
