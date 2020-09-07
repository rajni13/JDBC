package com.java.jdbc;
import java.sql.*;
public class JdbcConnetion
{    
  public static void main(String args[]) throws Exception
	{ 
		//String url = "jdbc:mysql://localhost:3306/emp"; 
        //String user = "root"; 
        //String pass = "";
        String query = "select username from student where userid=2";
	
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");  
	  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from student");  
	rs.next(); 
	String nmae = rs.getString("username");
	System.out.println("name");  
	con.close();  
	  
	}  
}

