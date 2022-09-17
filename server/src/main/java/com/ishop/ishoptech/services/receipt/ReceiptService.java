package com.ishop.ishoptech.services.receipt;

import com.ishop.ishoptech.models.receipt.Receipt;
import com.ishop.ishoptech.repository.receipt.ReceiptJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptService {

    private final ReceiptJPA receiptJPA;

    @Autowired
    public ReceiptService(ReceiptJPA receiptJPA) {
        this.receiptJPA = receiptJPA;
    }

    public List<Receipt> findAll() {
        return this.receiptJPA.findAll();
    }

}
