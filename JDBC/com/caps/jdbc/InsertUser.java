package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		//Load the driver
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded...");
			//Class.forName(com.mysql.jdbc.Driver);
		
		//Get "DB connection" via driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter user and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("Connection established...");
			
		//Issue "SQL queries" via connection
			String query="insert into users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter user id");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter username");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter email");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter password");
			pstmt.setString(4, sc.nextLine());
			int count=pstmt.executeUpdate();
			if(count > 0)
			{
				System.out.println("user inserted...");
			}
			else
			{
				System.err.println("something went wrong");
			}
			System.out.println("Query OK, "+count+" rows affected");
			 
			sc.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		//Process the results
		//close all jdbc objects

	}

}
