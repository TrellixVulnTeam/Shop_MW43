package com.ishop.ishoptech.services.receipt;

import com.ishop.ishoptech.models.receipt.ReceiptProduct;
import com.ishop.ishoptech.repository.receipt.ReceiptProductJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptProductService {

    private final ReceiptProductJPA receiptProductJPA;

    @Autowired
    public ReceiptProductService(ReceiptProductJPA receiptProductJPA) {
        this.receiptProductJPA = receiptProductJPA;
    }

    public List<ReceiptProduct> findAll() {
        return this.receiptProductJPA.findAll();
    }

}
