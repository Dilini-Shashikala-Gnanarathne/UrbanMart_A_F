package com.example.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
public class orderModel {
    @Id
    private int id;
    private String orderName;
    private String orderStatus;
    private String orderDate;
}
