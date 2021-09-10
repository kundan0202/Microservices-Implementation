package com.example.demo.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StockPriceEntity;
import com.example.demo.repo.StockPriceRepository;
import com.example.demo.response.StockPriceResponse;

@RestController
public class StockPriceRestController {
	
	//inject repo instance
	@Autowired
	private StockPriceRepository repo;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/price/{companyName}")
	//method to get stock price
	public ResponseEntity<StockPriceResponse> getPrice(@PathVariable String companyName){
		
		//By passing company Name,we get stock Entity
		StockPriceEntity stockEntity = repo.findByCompanyName(companyName);
		
		// data is available in Entity,it should be stored to response object as per response class
		StockPriceResponse reponse=new StockPriceResponse();
		
		//storing entity data to response object using copy prop. of Bean Util class
		BeanUtils.copyProperties(stockEntity, reponse);
		
		//To get port no.
		String port=env.getProperty("local.server.port");
		
		reponse.setPortNumber(Integer.parseInt(port));
		
		return new ResponseEntity<StockPriceResponse>(reponse,HttpStatus.OK);
		
	}

}
