package com.example.inventory.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class inventory {
    @Id
    private int inventoryID;
    private String inventoryName;
    private String inventoryDescription;
    private int inventoryPrice;
    private String inventoryCategory;
    private String inventoryImage;
}
