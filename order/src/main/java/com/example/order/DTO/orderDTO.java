package com.example.order.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class orderDTO {
    private int id;
    private String orderName;
    private String orderStatus;
    private String orderDate;

}
