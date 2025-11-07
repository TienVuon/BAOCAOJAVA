package com.evrental.model;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // Loại xe
    private Integer batteryCapacity; // Dung lượng pin (tính bằng %)
    private Double rentalPrice; // Giá thuê theo giờ

    // Getters and Setters
}
