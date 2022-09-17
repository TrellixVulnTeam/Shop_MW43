package com.ishop.ishoptech.repository.receipt;

import com.ishop.ishoptech.models.receipt.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptJPA extends JpaRepository<Receipt, Long> {
}
