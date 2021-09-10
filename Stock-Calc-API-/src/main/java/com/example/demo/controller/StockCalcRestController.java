package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.StockPriceFeignClient;
import com.example.demo.response.StockCalcResponse;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockPriceFeignClient client;
	
	@GetMapping("cost/{companyName}/{qty}")
	public StockCalcResponse getCost(@PathVariable String companyName,@PathVariable Integer qty) {
		
		StockCalcResponse stockPrice = client.getStockPrice(companyName);
		stockPrice.setTotalCost(qty*stockPrice.getCompanyPrice());
		return stockPrice;
	}
}
