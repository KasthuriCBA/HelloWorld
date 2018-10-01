package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloTest
 */
@WebServlet("/HelloTest")
public class HelloTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append(request.getContextPath());
		
PrintWriter out = response.getWriter();  
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("   <meta charset=\"UTF-8\" content=\"width=device-width, initial-scale=1\">");
		out.println("   <title>Hello | Test</title>");
		out.println("<body>");
		out.println("<h1> Hello World Prabath123r4eeeee </h1>");
		out.println("<h1> Hello World Prabath123r4eeeee123 </h1>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("   <meta charset=\"UTF-8\" content=\"width=device-width, initial-scale=1\">");
		out.println("   <title>Hello | Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Hello World Prabath </h1>");
		out.println("</h>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
