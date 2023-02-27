package com.tecodev.sistema.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private boolean enabled = true;
    private String profile;
}
