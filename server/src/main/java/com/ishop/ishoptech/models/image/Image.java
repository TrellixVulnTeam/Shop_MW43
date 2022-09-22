package com.ishop.ishoptech.models.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ishop.ishoptech.models.BaseEntity;
import com.ishop.ishoptech.models.product.Product;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Table
@Entity(name = "img")
@With
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Image extends BaseEntity {

    private String description;
    private String path_to_file;


}
