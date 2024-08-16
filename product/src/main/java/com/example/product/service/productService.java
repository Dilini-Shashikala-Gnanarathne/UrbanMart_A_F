package com.example.product.service;

import com.example.product.DTO.productDTO;
import com.example.product.model.product;
import com.example.product.repository.productRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class productService {
    @Autowired
    private  productRepo productRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<productDTO> getAllProduct(){
        List<product> productList= productRepository.findAll();
        return modelMapper.map(productList, new TypeToken<List<productDTO>>(){}.getType());
    }

}
