package com.gp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SourceServlet
 */
@WebServlet("/sourceServlet")
public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("user", userName);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<a href='targetServlet'>Click here to get the username</a>");
	}

}
