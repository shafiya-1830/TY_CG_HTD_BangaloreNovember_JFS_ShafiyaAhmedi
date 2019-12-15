package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Connection conn=null;
		//Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		
			//Load the driver
			
			try {
				Driver driver= new com.mysql.jdbc.Driver();
				DriverManager.registerDriver(driver);
				System.out.println("Driver loaded");
			
			//Get the "DB connection" via driver
				String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
				
				System.out.println("Enter username and password");
				String dbUser=sc.nextLine();
				String dbPass=sc.nextLine();
				conn=DriverManager.getConnection(dbUrl, dbUser, dbPass);
				System.out.println("connection established ");
				
			//Issue SQL queries via connection
				String query="select * from users_info"+" where userid=? and password=?";
				//stmt=conn.createStatement();
				//rs=stmt.executeQuery(query);
				pstmt=conn.prepareStatement(query);
				
				System.out.println("Enter userid");
				pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
				
				System.out.println("Enter password");
				pstmt.setString(2, sc.nextLine());
				
				rs=pstmt.executeQuery();
				System.out.println("Query issued");
				
			//Process the results returned by SQL queries
				if(rs.next())
				{
					System.out.println("userid: "+rs.getInt(1));
					System.out.println("username: "+rs.getString(2));
					System.out.println("password: "+rs.getString(3));
					
					
				}else
				{
					System.err.println("Something went wrong");
				}
		
				sc.close(); 
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally
			{
			//Close all JDBC objects
				if(conn!=null)
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				if(pstmt!=null)
					try {
						pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				if(rs!=null)
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		
		
	
		
	}
}
