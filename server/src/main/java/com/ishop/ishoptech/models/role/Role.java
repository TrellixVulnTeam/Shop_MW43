package com.ishop.ishoptech.models.role;

import com.ishop.ishoptech.models.BaseEntity;
import com.ishop.ishoptech.models.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Data
public class Role extends BaseEntity {
    @Column(name = "name")
    private String name;

}
