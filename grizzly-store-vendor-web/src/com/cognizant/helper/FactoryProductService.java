package com.cognizant.helper;

import com.cognizant.service.ProductService;
import com.cognizant.service.ProductServiceImpl;

public class FactoryProductService {
	public static ProductService createProductService(){
		ProductService productService= new ProductServiceImpl();
		return productService;
	}
}
