package com.ishop.ishoptech.models.type;

import com.ishop.ishoptech.models.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table
@Entity(name = "type")
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
public class Type extends BaseEntity {

    private String name;

}
