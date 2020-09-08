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

@WebServlet("/createUserServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection connection;
	
	public void init(){
		
		try {
		//	getClass().forName("com.mysql.jdbc.Driver");
			System.out.println("before init connection");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
		System.out.println("connection "+connection);
		System.out.println("after init connection");
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
		
		String fn = request.getParameter("firstName");
	    System.out.println("firstName is"+fn);
		String ln = request.getParameter("lastName");
		System.out.println("lasttName is"+ln);
		String email = request.getParameter("email");
		System.out.println("email is"+email);
		String pwd = request.getParameter("password");
		System.out.println("pwd is"+pwd);
		
		
		Statement statement;
		try {
			System.out.println("before stmt");
			statement = connection.createStatement();
			System.out.println("after stmt");
			System.out.println("before result");
			int result = statement.executeUpdate("insert into mydb.user values('"+fn+"','"+ln+"','"+email+"','"+pwd+"')");
			System.out.println("after stmt");
			PrintWriter out = response.getWriter();
	        if(result>0){
	        out.print("<H1>CREATED</H>");
	        }else{
	            out.print("<H1>Eror CREATing user</H>");
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
