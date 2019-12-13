package com.capgemini.contactdetails.factory;

import com.capgemini.contactdetails.bean.Contact;
import com.capgemini.contactdetails.dao.ContactDao;
import com.capgemini.contactdetails.dao.ContactDaoImpl;
import com.capgemini.contactdetails.services.ContactService;
import com.capgemini.contactdetails.services.ContactServicesImpl;

public class ContactManager {

	public static ContactDao instanceOfContactDaoImpl(){
		ContactDao dao=new ContactDaoImpl();
		return dao;
	}

	public static ContactService instanceOfContactServicesImpl(){
		ContactService service=new ContactServicesImpl();
		return service;
	}
}
