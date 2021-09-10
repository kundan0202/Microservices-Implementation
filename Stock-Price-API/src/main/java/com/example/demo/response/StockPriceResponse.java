package com.example.demo.response;

import lombok.Data;

@Data
public class StockPriceResponse {

	private Integer stockId;
	private String companyName;
	private Double companyPrice;
	private Integer portNumber;
}
