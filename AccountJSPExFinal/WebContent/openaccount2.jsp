<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%!
Connection con;
PreparedStatement ps;

public void jspInit(){
	try {
	Class.forName("com.mysql.jdbc.driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
	ps=con.prepareStatement("insert into account value(?)");
	} catch(Exception e){
		e.printStackTrace();
	}
}


public void jspDestroy(){
	try{
	ps.close();
	con.close();
} catch(Exception e){
	e.printStackTrace();
}
	
}
%>

<%=request.getParameter("lastname") %>



<%
int actno=Integer.parseInt(request.getParameter("accountnumber"));

ps.setInt(1,actno);


ps.executeUpdate();
%>
