package com.example.product.controller;

import com.example.product.DTO.productDTO;
import com.example.product.service.productService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class productController {
    private final com.example.product.service.productService productService;

    public productController(productService productService) {
        this.productService = productService;
    }

    @GetMapping("/getProduct")
        public List<productDTO> getProduct(){
            return productService.getAllProduct();
        }
    }


