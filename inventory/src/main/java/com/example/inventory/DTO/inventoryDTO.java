package com.example.inventory.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class inventoryDTO {
    private int inventoryID;
    private String inventoryName;
    private String inventoryDescription;
    private int inventoryPrice;
    private String inventoryCategory;
    private String inventoryImage;
}
