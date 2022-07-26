package com.ishop.ishoptech.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Table
@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@With
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    private String name;
    private BigDecimal price;


    private Long idType;
    private String productDescription;
    private Long idCompany;
    private Integer amount;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "product", fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    private List<Image> images;
}
