package com.example.order.controller;

import com.example.order.DTO.orderDTO;
import com.example.order.service.orderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class orderController {
    private final com.example.order.service.orderService orderService;

    public orderController(orderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getorder")
    public List<orderDTO> getorder() {
        return orderService.getAllorder();
    }

    @PostMapping("/createorder")
    public orderDTO createorder(@RequestBody orderDTO orderDTO) {
        return orderService.createorder(orderDTO);
    }
    @PutMapping("/updateorder")
    public orderDTO updateorder(@RequestBody orderDTO orderDTO) {
        return orderService.updateorder(orderDTO);
    }
    @DeleteMapping("/deleteorder")
    public orderDTO deleteorder(@RequestBody orderDTO orderDTO) {
        return orderService.deleteorder(orderDTO);
    }
}

