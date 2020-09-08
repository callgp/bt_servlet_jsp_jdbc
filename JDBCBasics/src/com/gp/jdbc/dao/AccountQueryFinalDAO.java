package com.gp.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountQueryFinalDAO {
	
	public static void main(String[] args) {
		
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			int executeUpdate = statement.executeUpdate("insert into account values(3344,'gpp3','gg3',3000)");
			System.out.println((executeUpdate+" rows isbserted"));
			
			int res = statement.executeUpdate("update account set bal=3000 where accno=3");
			System.out.println(res+" rows got updated");
			
			
			int executeUpdate2 = statement.executeUpdate("delete from account where accno=2");
			System.out.println(executeUpdate2+" rows got deleteed");
			
			
			ResultSet rs = statement.executeQuery("select * from account");
			
			while(rs.next()){
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



/*com.mysql.cj.jdbc.ConnectionImpl@6eceb130
1 rows isbserted
3 rows got updated
0 rows got deleteed
gpp
gg
5000
gpp
gg
5000
gpp3
gg3
3000
gpp3
gg3
3000
gpp3
gg3
3000*/
