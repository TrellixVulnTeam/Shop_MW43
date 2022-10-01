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
    private String description;
    private String fullDescription;
    private Integer amount;

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

    @JsonProperty(value = "images")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idProduct")
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Image> images;

    @JsonProperty(value = "receiptProduct")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idProduct")
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<ReceiptProduct> receiptProducts;

}
