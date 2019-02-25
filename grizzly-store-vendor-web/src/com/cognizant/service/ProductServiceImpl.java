package com.cognizant.service;

import java.util.List;

import com.cognizant.dao.ProductDAO;
import com.cognizant.entity.Product;
import com.cognizant.helper.FactoryProductDAO;

public class ProductServiceImpl implements ProductService{
	ProductDAO productDAO= FactoryProductDAO.createProductDAO();
	@Override
	public boolean addProduct(Product product) {
		boolean result=productDAO.addProduct(product);
		return result;
	}

	@Override
	public List<Product> listProduct() {
		
		List<Product> productList=productDAO.listProduct();
		return productList;
	}

	@Override
	public boolean checkProduct(String productId, String productCategory) {
		boolean productExists= productDAO.checkProduct(productId, productCategory);
		return productExists;
	}

	@Override
	public Product viewProduct(String productId) {
		Product product = productDAO.viewProduct(productId);
		return product;
	}
	
}
