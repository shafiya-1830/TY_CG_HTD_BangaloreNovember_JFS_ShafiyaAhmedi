package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//Load Driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver); 
			System.out.println("Driver loaded ");
			
			//Get DB connection via Driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+ "?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			
			//Issue SQL query via connection
			String query="select * from users_info";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);//rs is jst an object representation of result table
			System.out.println("Query issued");
			System.out.println("****************************************");
			
			//process the result returned  
			while(rs.next())
			{
				System.out.println("Userid: "+rs.getInt("userid"));
				System.out.println("UserName: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("*************************************");
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			//close all JDBC objects
			
			
				
					
						try {
							if(conn!=null)
							conn.close();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
				
				
				try
				{
					if(stmt!=null)
						stmt.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
				try
				{
					if(rs!=null)
						rs.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
		}

	}

}
