package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.response.StockCalcResponse;

@FeignClient(name="Stock-Price-API")
public interface StockPriceFeignClient {

	@GetMapping("/price/{companyName}")
	public StockCalcResponse getStockPrice(@PathVariable String companyName);
}
