package com.copacabana.copacabana.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name="user")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="identity_card")
    private String identityCard;
    @Column(name="password")
    private String password;
    @Column(name="type_code")
    private String typeCode;
    @Column(name="user_name")
    private String userName;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="work_position_code")
    private String workPositionCode;
    @Column(name="work_function_code")
    private String workFunctionCode;
}
