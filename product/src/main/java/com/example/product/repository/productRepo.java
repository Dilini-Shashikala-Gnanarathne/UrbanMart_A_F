package com.example.product.repository;

import com.example.product.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<product, Integer> {


}
