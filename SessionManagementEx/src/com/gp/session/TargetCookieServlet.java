package com.gp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TargetServlet
 */
@WebServlet("/targetCookieServlet")
public class TargetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TargetCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
Cookie[] cookies = request.getCookies();
		
		for(int i=0;i<cookies.length;i++){
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
			
		}
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("user");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<h1> User name is :"+userName+"</h1>");
		
		
	}

	

}
