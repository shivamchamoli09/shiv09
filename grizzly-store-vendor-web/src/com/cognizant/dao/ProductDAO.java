package com.cognizant.dao;

import java.util.List;

import com.cognizant.entity.Product;

public interface ProductDAO {
	boolean addProduct(Product product);
	boolean checkProduct(String productId,String productCategory);
	List<Product> listProduct();
	Product viewProduct(String productId);
}
