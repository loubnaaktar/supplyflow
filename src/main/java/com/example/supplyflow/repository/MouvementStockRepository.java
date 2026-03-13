package com.example.supplyflow.repository;

import com.example.supplyflow.model.MouvementStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouvementStockRepository  extends JpaRepository<MouvementStock, Integer> {
}
