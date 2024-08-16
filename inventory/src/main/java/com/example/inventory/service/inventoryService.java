package com.example.inventory.service;

import com.example.inventory.DTO.inventoryDTO;
import com.example.inventory.model.inventory;
import com.example.inventory.repository.inventoryRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class inventoryService {
    @Autowired
    private  inventoryRepo inventoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<inventoryDTO> getAllinventory(){
        List<inventory> inventoryList= inventoryRepository.findAll();
        return modelMapper.map(inventoryList, new TypeToken<List<inventoryDTO>>(){}.getType());
    }

    public inventoryDTO createinventory(inventoryDTO inventoryDTO){
        inventoryRepository.save(modelMapper.map(inventoryDTO, inventory.class));
        return inventoryDTO;
    }
    public inventoryDTO updateinventory(inventoryDTO inventoryDTO){
        inventoryRepository.save(modelMapper.map(inventoryDTO, inventory.class));
        return inventoryDTO;
    }
    public inventoryDTO deleteinventory(inventoryDTO inventoryDTO){
        inventoryRepository.delete(modelMapper.map(inventoryDTO, inventory.class));
        return inventoryDTO;
    }

}
