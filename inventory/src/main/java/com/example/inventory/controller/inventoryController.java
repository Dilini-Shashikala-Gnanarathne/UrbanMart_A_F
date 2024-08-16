package com.example.inventory.controller;

import com.example.inventory.DTO.inventoryDTO;
import com.example.inventory.service.inventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class inventoryController {
    private final com.example.inventory.service.inventoryService inventoryService;

    public inventoryController(inventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/getinventory")
    public List<inventoryDTO> getinventory() {
        return inventoryService.getAllinventory();
    }

    @PostMapping("/createinventory")
    public inventoryDTO createinventory(@RequestBody inventoryDTO inventoryDTO) {
        return inventoryService.createinventory(inventoryDTO);
    }
    @PutMapping("/updateinventory")
    public inventoryDTO updateinventory(@RequestBody inventoryDTO inventoryDTO) {
        return inventoryService.updateinventory(inventoryDTO);
    }
    @DeleteMapping("/deleteinventory")
    public inventoryDTO deleteinventory(@RequestBody inventoryDTO inventoryDTO) {
        return inventoryService.deleteinventory(inventoryDTO);
    }
}

