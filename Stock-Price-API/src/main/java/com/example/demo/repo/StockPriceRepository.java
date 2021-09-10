package com.example.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StockPriceEntity;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Serializable> {
	
	//Method to get company Name
	public StockPriceEntity findByCompanyName(String companyName);
}
