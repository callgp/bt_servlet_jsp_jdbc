<%@ page import="java.sql.*, com.mysql.jdbc.Driver" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	


<%!
Connection con;
PreparedStatement ps;

public void jspInit(){
	try {
	Class.forName("com.mysql.jdbc.driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","admin");
	ps=con.prepareStatement("insert into account value(?,?,?,?)");
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


<%
int actno=Integer.parseInt(request.getParameter("accountnumber"));
String lastName=request.getParameter("lastname");
String firstName=request.getParameter("firstname");
int bal=Integer.parseInt(request.getParameter("balance"));
ps.setInt(1, actno);
ps.setString(2, lastName);
ps.setString(3, firstName);
ps.setInt(4, bal);

ps.executeUpdate();
%>


<%@ include file="openaccount.html" %>