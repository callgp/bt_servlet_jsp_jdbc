package com.gp.servlet.preparedstatement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement stmt;
	
  
	public void init(){
		try {
			System.out.println("in init beginning 1");
			Class.forName("com.mysql.jdbc.Driver");
			//try {
				con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","admin");
				System.out.println("in init ager getconn");
			
			stmt=con.prepareStatement("insert into product values(?,?,?,?)");
			System.out.println("after insert preparted stment");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do post begiingn");
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("id is"+id);
		String name=request.getParameter("name");
		System.out.println("name is"+name);
		String desc=request.getParameter("description");
		System.out.println("desc is"+desc);
		int price=Integer.parseInt(request.getParameter("price"));
		System.out.println("price is"+price);
		
		
		try {
			System.out.println("before stmt settrs");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, desc);
			stmt.setInt(4, price);
			System.out.println("after stmt setters before execute updat");
			
			int result = stmt.executeUpdate();
			System.out.println("aftre execure update");
			
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			System.out.println("before result");
			out.print("<b>"+result+"products created"+"</b>");
			System.out.println("after resutl");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
