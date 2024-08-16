package com.example.order.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class orderDTO {
    private int orderID;
    private String orderName;
    private String orderDescription;
    private int orderPrice;
    private String orderCategory;
    private String orderImage;
}
