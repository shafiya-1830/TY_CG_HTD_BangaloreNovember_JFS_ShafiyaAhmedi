package com.caps.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.Connection;

public class EvolvedJDBC {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("enter db username and password");
		String user=sc.nextLine();
		String pass=sc.nextLine();
		String query="select * from users_info";
		
		
		try(Connection conn=DriverManager.getConnection(dbUrl,user,pass);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);)
		{
			while(rs.next())
			{
				System.out.println("Userid: "+rs.getInt(1));
				System.out.println("Username: "+rs.getString(2));
				System.out.println("password: "+rs.getString(3));
				
			}
			sc.close();
		}catch(Exception e)
		{
			
		}
	}

}
