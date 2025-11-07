package com.evrental.model;

import javax.persistence.*;

@Entity
public class EVRenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String licenseNumber;
    private String identityCard;

    // Getters and Setters
}
