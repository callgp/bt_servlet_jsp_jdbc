package com.gp.user.servlets.init;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CreateUserServlet
 */

@WebServlet("/readUserServlet")
public class ReadUserServletInit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection connection;
	
	public void init(){
		
		try {
		    Class.forName("com.mysql.jdbc.Driver");
			System.out.println("before init connection");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
		System.out.println("connection "+connection);
		System.out.println("after init connection");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public CreateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	
		
		try {
		Statement statement;
		
			System.out.println("before stmt");
			statement = connection.createStatement();
			System.out.println("after stmt");
			System.out.println("before result");
			ResultSet resultSet = statement.executeQuery("select * from user");
			System.out.println("after stmt");
			PrintWriter out = response.getWriter();
	        
			out.print("<table>");
			
			out.print("<tr>");
			
			out.print("<th>");
			out.print("First Name");
			out.print("</th>");
			
			out.print("<th>");
			out.print("Last Name");
			out.print("</th>");
			
			
			out.print("<th>");
			out.print("Email");
			out.print("</th>");
			out.print("</tr>");
		
			while(resultSet.next()){
				out.print("<tr>");	
				
				out.print("<td>");
				out.print(resultSet.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(resultSet.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(resultSet.getString(3));
				out.print("</td>");
				
				out.print("</tr>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void destroy(){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
