package org.sample;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Sql {
public static void main(String[] args) throws ClassNotFoundException, SQLException   {
	
		
	
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Kumar:1521:xe","Hr","Annal@123");
      
       String  q="select * from employees";
       PreparedStatement pre = con.prepareStatement(q);
       ResultSet s=  pre.executeQuery();
       while(s.next())
       {
       String name=  s.getString("first_name");
       System.out.println(name);
	

		

	
}
}
}