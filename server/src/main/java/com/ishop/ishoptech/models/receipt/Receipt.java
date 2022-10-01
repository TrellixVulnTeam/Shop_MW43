package com.ishop.ishoptech.models.receipt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ishop.ishoptech.models.BaseEntity;
import com.ishop.ishoptech.models.image.Image;
import com.ishop.ishoptech.models.user.User;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table
@Entity(name = "receipt")
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
public class Receipt extends BaseEntity {

    private String firstname;
    private String lastname;
    private String telephone;
    private Date date;

    @ToString.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idUser")
    private User user;

    @JsonProperty(value = "receiptProduct")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idReceipt")
    @Fetch(FetchMode.JOIN)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<ReceiptProduct> receiptProducts;

}
