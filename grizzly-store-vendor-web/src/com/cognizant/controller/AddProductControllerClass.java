package com.cognizant.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.entity.Product;
import com.cognizant.helper.FactoryProductService;
import com.cognizant.service.ProductService;

/**
 * Servlet implementation class AddProductControllerClass
 */
@WebServlet(name = "AddProductController", urlPatterns = { "/addproduct" })
public class AddProductControllerClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductControllerClass() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productservice = FactoryProductService.createProductService();
		Product product =new Product();
		String productCategory =request.getParameter("productCategory");
		String productDescription = request.getParameter("productDescription");
		String productId =request.getParameter("productId");
		String productName =request.getParameter("productName");
		double productPrice = Double.parseDouble(request.getParameter("productPrice"));
		product.setProductCategory(productCategory);
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setProductDescription(productDescription);
		boolean productExists =productservice.checkProduct(productId, productCategory);
		if(!productExists){
			boolean productAdded= productservice.addProduct(product);
			request.setAttribute("product",product);
			RequestDispatcher rd= request.getRequestDispatcher("listproduct");
			if(productAdded){
				request.setAttribute("status","success");
				rd.forward(request, response);
			}
			else{
				request.setAttribute("status","failed");
				rd.forward(request, response);
			}
		}
	}

}
