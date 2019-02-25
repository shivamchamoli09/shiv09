package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cognizant.entity.Product;
import com.cognizant.helper.ConnectionManager;

public class ProductDAOImpl implements ProductDAO{
	private ConnectionManager manager= new ConnectionManager();
	boolean result=false;
	@Override
	public boolean addProduct(Product product) {
		String productName=product.getProductName();
		String productId= product.getProductId();
		double productPrice =product.getProductPrice();
		String productDescription=product.getProductDescription();
		String productCategory=product.getProductCategory();
		Connection con = manager.openConnection();
		try {
			PreparedStatement stmt= con.prepareStatement("INSERT INTO PRODUCTS VALUES(?,?,?,?,?)");
			stmt.setString(1, productId);
			stmt.setString(2, productName);
			stmt.setString(4, productDescription);
			stmt.setString(3, productCategory);
			stmt.setDouble(5, productPrice);
			int rows=stmt.executeUpdate();
			if(rows>0)
				result=true;
			else 
				result=false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean checkProduct(String productId,String productCategory) {
		Connection con = manager.openConnection();
	try {
		PreparedStatement stmt= con.prepareStatement("SELECT PRODUCT_CATEGORY FROM PRODUCTS WHERE PRODUCT_ID=? AND PRODUCT_CATEGORY=?");
		stmt.setString(1, productId);
		stmt.setString(2, productCategory);
		ResultSet set = stmt.executeQuery();
		result=set.next();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	manager.closeConnection();

	return result;
	}

	@Override
	public List<Product> listProduct() {
		Connection con = manager.openConnection();
		List<Product> productList=null;
		try {
			PreparedStatement stmt = con.prepareStatement("Select * from PRODUCTS");
			ResultSet set=stmt.executeQuery();
			productList= new ArrayList<Product>();
			while(set.next()){
				Product temp = new Product();
				temp.setProductId(set.getString("PRODUCT_ID"));
				temp.setProductName(set.getString("PRODUCT_NAME"));
				temp.setProductDescription(set.getString("PRODUCT_DESCRIPTION"));
				temp.setProductCategory(set.getString("PRODUCT_CATEGORY"));
				temp.setProductPrice(set.getDouble("PRODUCT_PRICE"));
				productList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productList;
	}

	@Override
	public Product viewProduct(String productId) {

		Connection con = manager.openConnection();
		Product product = new Product();
		try {
			PreparedStatement stmt= con.prepareStatement("SELECT * FROM PRODUCTS WHERE PRODUCT_ID=?");
			stmt.setString(1, productId);
			ResultSet set =stmt.executeQuery();
			set.next();
			product.setProductDescription(set.getString("PRODUCT_DESCRIPTION"));
			product.setProductCategory(set.getString("PRODUCT_CATEGORY"));
			product.setProductId(set.getString("PRODUCT_ID"));
			product.setProductName(set.getString("PRODUCT_NAME"));
			product.setProductPrice(set.getDouble("PRODUCT_PRICE"));
			System.out.println(product.toString());
		} catch (SQLException e) {
			//e.printStackTrace();
		}
		System.out.println(product.toString());
		return product;
	}
		
}
