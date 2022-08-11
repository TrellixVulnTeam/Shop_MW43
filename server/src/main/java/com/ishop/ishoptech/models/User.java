package com.ishop.ishoptech.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User extends BaseEntity{

    @Column(name = "username")
    private String username;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_user",
    joinColumns = {@JoinColumn(name = "idUser", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "idRole", referencedColumnName = "id")})
    private List<Role> roles;

}
