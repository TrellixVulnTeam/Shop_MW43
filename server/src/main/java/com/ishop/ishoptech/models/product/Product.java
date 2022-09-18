package com.ishop.ishoptech.models.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ishop.ishoptech.models.BaseEntity;
import com.ishop.ishoptech.models.chipset.Chipset;
import com.ishop.ishoptech.models.company.Company;
import com.ishop.ishoptech.models.image.Image;
import com.ishop.ishoptech.models.receipt.ReceiptProduct;
import com.ishop.ishoptech.models.type.Type;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Data
@Table
@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
public class Product extends BaseEntity {

    private String name;
    private BigDecimal price;


    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idType")
    private Type type;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idCompany")
    private Company company;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idChipset")
    private Chipset chipset;

    private String description;
    private Integer amount;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "product", fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    private Set<Image> images;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "receipt", fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    private Set<ReceiptProduct> receiptProducts;

}
