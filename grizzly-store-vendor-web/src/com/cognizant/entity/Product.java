package com.cognizant.entity;

public class Product {
	private String productId;
	private String productName;
	private String productCategory;
	private String productDescription;
	private double productPrice;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productID) {
		this.productId = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String toString(){
		return new String(this.productId+" "+this.productName+" "+this.productDescription+" "+this.productPrice+this.productCategory);
		
	}
}
