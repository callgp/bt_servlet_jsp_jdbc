package com.gp.advjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataBatchDAO {

	
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","admin");
				
				Statement stmt=con.createStatement();				
				){
			
			stmt.addBatch("insert into account values (111,'clcln','fnfn',10000)");
			stmt.addBatch("insert into account values (112,'clclnnn','fnfnnn',20000)");
			
			
			int[] result = stmt.executeBatch();
			
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
			
			
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
