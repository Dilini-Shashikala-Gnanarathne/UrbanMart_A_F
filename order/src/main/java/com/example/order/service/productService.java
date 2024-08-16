package com.example.order.service;



import com.example.order.DTO.orderDTO;
import com.example.order.model.order;
import com.example.order.repository.orderRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class orderService {
    @Autowired
    private  orderRepo orderRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<orderDTO> getAllorder(){
        List<order> orderList= orderRepository.findAll();
        return modelMapper.map(orderList, new TypeToken(){}.getType());
    }

    public orderDTO createorder(orderDTO orderDTO){
        orderRepository.save(modelMapper.map(orderDTO, order.class));
        return orderDTO;
    }
    public orderDTO updateorder(orderDTO orderDTO){
        orderRepository.save(modelMapper.map(orderDTO, order.class));
        return orderDTO;
    }
    public orderDTO deleteorder(orderDTO orderDTO){
        orderRepository.delete(modelMapper.map(orderDTO, order.class));
        return orderDTO;
    }

}
