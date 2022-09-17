package com.ishop.ishoptech.repository.company;

import com.ishop.ishoptech.models.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyJPA extends JpaRepository<Company, Long> {
}
