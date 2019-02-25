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
 * Servlet implementation class ViewProductControllerClass
 */
@WebServlet(name = "ViewProductController", urlPatterns = { "/viewproduct" })
public class ViewProductControllerClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProductControllerClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productservice = FactoryProductService.createProductService();
		String productId=(String)request.getParameter("productId");
		Product product= productservice.viewProduct(productId);
		request.setAttribute("product",product);
		RequestDispatcher rd= request.getRequestDispatcher("viewProduct.jsp");
		rd.forward(request, response);
	}

}
