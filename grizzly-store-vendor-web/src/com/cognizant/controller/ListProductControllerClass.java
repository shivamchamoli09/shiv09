package com.cognizant.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ListProductControllerClass
 */
@WebServlet(name = "ListProductController", urlPatterns = { "/listproduct" })
public class ListProductControllerClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductControllerClass() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productservice = FactoryProductService.createProductService();
		List<Product> productList=productservice.listProduct();
		RequestDispatcher rd= request.getRequestDispatcher("listProduct.jsp");
		request.setAttribute("productList",productList);
		rd.forward(request, response);
	}

}
