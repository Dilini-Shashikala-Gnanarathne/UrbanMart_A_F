package com.example.product.controller;

import com.example.product.DTO.productDTO;
import com.example.product.service.productService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class productController {
    private final com.example.product.service.productService productService;

    public productController(productService productService) {
        this.productService = productService;
    }

    @GetMapping("/getproduct")
    public List<productDTO> getProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/createproduct")
    public productDTO createProduct(@RequestBody productDTO productDTO) {
        return productService.createProduct(productDTO);
    }
    @PutMapping("/updateproduct")
    public productDTO updateProduct(@RequestBody productDTO productDTO) {
        return productService.updateProduct(productDTO);
    }
    @DeleteMapping("/deleteproduct")
    public productDTO deleteProduct(@RequestBody productDTO productDTO) {
        return productService.deleteProduct(productDTO);
    }
}

