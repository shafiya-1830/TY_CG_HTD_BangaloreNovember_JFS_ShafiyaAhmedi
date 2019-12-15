package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUser {

	public static void main(String[] args) {

		Connection conn=null;
		Scanner sc=new Scanner(System.in);
		PreparedStatement pstmt=null;
		//Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded..");
		//Get db connection via driver	
		
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter username and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("Connection established");
			
		//Issue sql queries via connection
			String query="update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter email to update");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter user id");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enetr password");
			pstmt.setString(3, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			System.out.println("Query issued..");
			//process the results returned by sql queries
			if(count>0)
			{
				System.out.println("user's email updated");
			}else
			{
				System.err.println("something went wrong");
			}
			
			System.out.println("Query OK "+count+" rows affected");
			
			sc.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{//close all the jdbc objects
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
		
	}

	
			
			
			
}
