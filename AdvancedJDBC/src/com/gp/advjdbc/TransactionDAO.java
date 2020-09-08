package com.gp.advjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDAO {

	
	public static void main(String[] args) {
		Connection con=null;
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","admin");
			
			Statement stmt=con.createStatement();				
			
			con.setAutoCommit(false);//one stroke
			stmt.executeUpdate("update account set bal=bal-500 where accno=112");
			stmt.executeUpdate("update account set bal=bal+500 where accno=111");
			con.commit();
			
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		try {
			con.close();
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
}
