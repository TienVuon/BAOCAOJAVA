package com.evrental.model;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount; // Số tiền thanh toán
    private String status; // Trạng thái thanh toán (thành công, thất bại)

    // Getters and Setters
}
