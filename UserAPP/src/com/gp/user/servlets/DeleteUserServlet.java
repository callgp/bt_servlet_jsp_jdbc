package com.gp.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet("/deleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection connection;
	
	public void init(){
		
		try {
		  try {
			  System.out.println("before connection");
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
			System.out.println("after connection");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("before connection");
		//connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
		//System.out.println("after connection");
		} catch (SQLException e) {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//String fn = request.getParameter("firstName");
		//String ln = request.getParameter("lastName");
		String email = request.getParameter("email");
		System.out.println("email is  "+email);
		String password = request.getParameter("password");
		System.out.println("password is "+password);
		
		
		Statement statement;
		try {
			System.out.println("before stmt");
			statement = connection.createStatement();
			System.out.println("after stmt");
			System.out.println("before result");
		//	int result = statement.executeUpdate("insert into user values('"+fn+"','"+ln+"','"+email+"','"+pwd+"')");
			int result = statement.executeUpdate(" delete from user  where email='"+email+"' ");
			System.out.println("after result"+result);
			PrintWriter out = response.getWriter();
	        if(result>0){
	        out.print("<H1>user deleted</H>");
	        }else{
	            out.print("<H1>user not found in db to delete</H>");
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
