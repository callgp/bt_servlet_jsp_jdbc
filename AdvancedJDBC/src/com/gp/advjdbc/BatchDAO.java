package com.gp.advjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {

	
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","admin");
				
				Statement stmt=con.createStatement();				
				){
			
			 ResultSet resultSet = stmt.executeQuery("select * from account");
			 ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			 int columnCount = resultSetMetaData.getColumnCount();
			 for(int i=1; i<=columnCount;i++){
				 System.out.println(resultSetMetaData.getColumnName(i));
				 System.out.println(resultSetMetaData.getColumnTypeName(i));
			 }
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
