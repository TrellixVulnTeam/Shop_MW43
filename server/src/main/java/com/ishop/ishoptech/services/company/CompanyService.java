package com.ishop.ishoptech.services.company;

import com.ishop.ishoptech.models.company.Company;
import com.ishop.ishoptech.repository.company.CompanyJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyJPA companyJPA;

    @Autowired
    public CompanyService(CompanyJPA companyJPA) {
        this.companyJPA = companyJPA;
    }

    public List<Company> findAll() {
        return companyJPA.findAll();
    }

}
