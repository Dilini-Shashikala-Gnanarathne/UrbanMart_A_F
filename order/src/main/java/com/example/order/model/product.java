package com.example.order.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    @Id
    private int orderID;
    private String orderName;
    private String orderDescription;
    private int orderPrice;
    private String orderCategory;
    private String orderImage;
}
