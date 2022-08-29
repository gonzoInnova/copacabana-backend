package com.copacabana.copacabana.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Getter @Setter @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name="name")
    private String name;
    @Getter @Setter @Column(name="identity_card")
    private String identityCard;
    @Getter @Setter @Column(name="password")
    private String password;
    @Getter @Setter @Column(name="type_code")
    private String typeCode;
    @Getter @Setter @Column(name="user_name")
    private String userName;
    @Getter @Setter @Column(name="email")
    private String email;
    @Getter @Setter @Column(name="phone")
    private String phone;
    @Getter @Setter @Column(name="work_position_code")
    private String workPositionCode;
    @Getter @Setter @Column(name="work_function_code")
    private String workFunctionCode;
}
