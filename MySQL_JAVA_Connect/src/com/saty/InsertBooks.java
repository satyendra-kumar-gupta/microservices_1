package com.saty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBooks {
	private static final String DB_URL ="jdbc:mysql://localhost:3306/advjava";
	private static final String DB_UNAME ="root";
	private static final String DB_PWD ="12345678";
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(105, 'javascript', 2000)";

	public static void main(String[] args) throws Exception {
		//Step-1: load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2: Get the DB connection
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
       
		// Step-3: Create Statement
	    Statement stmt	= con.createStatement();
       
	    //Step-4: Execute Statement
	    int rowsEffected = stmt.executeUpdate(INSERT_SQL);
	    
	    //Step-5: Process Result
	    System.out.println("Rows Efected : " + rowsEffected);
	    
	    
	    //Step-6: Close connection
	    con.close();
	}

}
