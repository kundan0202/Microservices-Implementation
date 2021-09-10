package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "STOCK_PRICES")
public class StockPriceEntity {

	@Id
	private Integer stockId;
	private String companyName;
	private Double companyPrice;
}
