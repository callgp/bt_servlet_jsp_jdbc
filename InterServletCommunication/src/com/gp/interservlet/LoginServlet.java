package com.gp.interservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("userName");
		String pwd = request.getParameter("password");
		
		try {
		    Class.forName("com.mysql.jdbc.Driver");
			System.out.println("before init connection");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
		System.out.println("connection "+connection);
		System.out.println("after init connection");
		
		Statement statement;
		
		System.out.println("before stmt");
		statement = connection.createStatement();
		System.out.println("after stmt");
		System.out.println("before result");
		ResultSet resultSet = statement.executeQuery("select * from user where 	email='"+user+"' and password='"+pwd+"'");
		System.out.println("after stmt");
		//PrintWriter out = response.getWriter();
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("homeServlet");
		System.out.println("user is--->"+user);
		if(resultSet.next()){
			request.setAttribute("message", "welcome to inter servlet communication"+user);
			requestDispatcher.forward(request, response);
		}
		else{
		requestDispatcher = request.getRequestDispatcher("login.html");
		requestDispatcher.include(request, response);
		}
        
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	}


