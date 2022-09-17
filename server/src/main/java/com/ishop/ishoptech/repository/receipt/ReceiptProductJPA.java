package com.ishop.ishoptech.repository.receipt;

import com.ishop.ishoptech.models.receipt.ReceiptProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptProductJPA extends JpaRepository<ReceiptProduct, Long> {
}
