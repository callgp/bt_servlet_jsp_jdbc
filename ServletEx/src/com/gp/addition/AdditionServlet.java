package com.gp.addition;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("nbr1")!=null && request.getParameter("nbr2")!=null){
		Long parameter1 = Long.parseLong(request.getParameter("nbr1"));
		Long parameter2 = Long.parseLong(request.getParameter("nbr2"));

		PrintWriter writer = response.getWriter();
		writer.print("result is"+(parameter1+parameter2));
	}

}
}
