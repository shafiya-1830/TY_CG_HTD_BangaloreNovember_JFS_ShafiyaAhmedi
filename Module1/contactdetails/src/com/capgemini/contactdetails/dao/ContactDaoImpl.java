package com.capgemini.contactdetails.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactdetails.bean.Contact;

public class ContactDaoImpl implements ContactDao{

	FileReader reader;
	Properties prop;
	Contact contact;

	public ContactDaoImpl()
	{
		try {
			reader=new FileReader("data.properties");
			prop=new Properties();
			prop.load(reader);
			contact=new Contact();
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean addContact(Contact contact) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"));){	
			pstmt.setString(1, contact.getName());
			pstmt.setLong(2, contact.getNumber());
			pstmt.setString(3, contact.getGroup());
			int count=pstmt.executeUpdate();
			if(count>0){
				return true;
			}
		}catch(Exception e)	{
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteQuery"));	) {
			pstmt.setString(1, name);
			int count=pstmt.executeUpdate();
			if(count>0)	{
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean editContact(Contact contact) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateQuery"));	)	{
			pstmt.setString(3, contact.getName());
			pstmt.setLong(1, contact.getNumber());
			pstmt.setString(2, contact.getGroup());
			int count=pstmt.executeUpdate();
			if(count>0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Contact getContact(String name) {
		
		List<Contact> list=new ArrayList<Contact>();
		
		try{
			Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchQuery"));
				
				ResultSet rs=pstmt.executeQuery();		
			pstmt.setString(1, contact.getName());
			list.add(contact);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Contact> getAllContact() {

		List<Contact> list=new ArrayList<Contact>();
		try(	Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));		){
			while(rs.next())			{
				contact=new Contact();
				contact.setName(rs.getString(1));
				contact.setNumber(rs.getLong(2));
				contact.setGroup(rs.getString(3));
				list.add(contact);
			}
			return list; 
		}catch(Exception e)		{
			e.printStackTrace();
		}

		return null;
	}
}




















