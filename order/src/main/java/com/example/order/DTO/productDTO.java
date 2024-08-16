package com.example.product.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class productDTO {
    private int productID;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productCategory;
    private String productImage;
}
