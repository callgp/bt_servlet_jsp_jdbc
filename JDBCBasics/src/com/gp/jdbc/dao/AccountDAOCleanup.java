package com.gp.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAOCleanup {
	
	public static void main(String[] args) {
		
		//Connection connection;
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "admin");
				Statement statement = connection.createStatement();
				//int executeUpdate = statement.executeUpdate("insert into account values(3,'gpp3','gg3',3000)");
				ResultSet rs = statement.executeQuery("select * from account");
				
				) {
			//connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "admin");
			//System.out.println(connection);
			//Statement statement = connection.createStatement();
			//int executeUpdate = statement.executeUpdate("insert into account values(3,'gpp3','gg3',3000)");
			//System.out.println((executeUpdate+" rows isbserted"));
			
		//	int res = statement.executeUpdate("update account set bal=3000 where accno=3");
			//System.out.println(res+" rows got updated");
			
			
		//	int executeUpdate2 = statement.executeUpdate("delete from account where accno=2");
			//System.out.println(executeUpdate2+" rows got deleteed");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//finally close connection beofre java 8..now just in try we can do
		//rs.close
		//stmt.close
	//	conn.close same order also ok to do
		
	}

}


/*com.mysql.cj.jdbc.ConnectionImpl@6eceb130
1 rows isbserted
4 rows got updated
0 rows got deleteed*/
