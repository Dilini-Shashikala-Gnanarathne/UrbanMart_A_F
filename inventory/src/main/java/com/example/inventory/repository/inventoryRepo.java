package com.example.inventory.repository;

import com.example.inventory.model.inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inventoryRepo extends JpaRepository<inventory, Integer> {


}
