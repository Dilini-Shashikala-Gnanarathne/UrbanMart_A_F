package com.example.product.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class product {
    @Id
    private int productID;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productCategory;
    private String productImage;
}
