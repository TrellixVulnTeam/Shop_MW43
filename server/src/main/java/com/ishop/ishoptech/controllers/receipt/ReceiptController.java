package com.ishop.ishoptech.controllers.receipt;

import com.ishop.ishoptech.models.receipt.Receipt;
import com.ishop.ishoptech.services.receipt.ReceiptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/receipts")
public class ReceiptController {

    private final ReceiptService receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @GetMapping("/user/{id}")
    public List<Receipt> findByUserId(@PathVariable String id) {
        return receiptService.findByUserId(Long.valueOf(id));
    }

    @GetMapping("/{id}")
    public Receipt findById(@PathVariable String id) {
        return receiptService.findById(Long.valueOf(id));
    }

    @GetMapping("/")
    public List<Receipt> findAll() {
        return receiptService.findAll();
    }

}
