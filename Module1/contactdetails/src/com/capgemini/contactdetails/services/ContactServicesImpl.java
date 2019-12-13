package com.capgemini.contactdetails.services;

import java.util.List;

import com.capgemini.contactdetails.bean.Contact;
import com.capgemini.contactdetails.dao.ContactDaoImpl;

public class ContactServicesImpl implements ContactService{

	ContactDaoImpl dao=new ContactDaoImpl();
	
	@Override
	public boolean addContact(Contact contact) {
		return dao.addContact(contact);
	}

	@Override
	public boolean deleteContact(String name) {
		return dao.deleteContact(name);
	}

	@Override
	public boolean editContact(Contact contact) {
		return dao.editContact(contact);
	}

	@Override
	public Contact getContact(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContact() {
		
		return dao.getAllContact();
	}

}
