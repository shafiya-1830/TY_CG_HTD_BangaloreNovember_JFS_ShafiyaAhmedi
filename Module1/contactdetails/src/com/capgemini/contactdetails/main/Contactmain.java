package com.capgemini.contactdetails.main;

import java.util.List;
import java.util.Scanner;

import com.capgemini.contactdetails.bean.Contact;
import com.capgemini.contactdetails.factory.ContactManager;
import com.capgemini.contactdetails.services.ContactService;

public class Contactmain {

	public static void main(String[] args) {

		Contact contact=new Contact();
		ContactService service=ContactManager.instanceOfContactServicesImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to show all contacts");
			System.out.println("press 2 to search for contact");
			System.out.println("press 3 to operate on contact");

			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				List<Contact> list=service.getAllContact();
				if(list!=null){
					for(Contact cont:list){
						System.out.println(cont);
					}
				}
				break;
			case 2:
				System.out.println("Enter the name");
				String name=sc.next();
				
				//List<Contact> list=service.getContact(name);
//				if(cont!=null){
//					System.out.println(contact.getName());
//					System.out.println(contact.getNumber());
//					System.out.println(contact.getGroup());
//				}
//				else{
//					System.out.println("contact does not exit");
//				}
				Info.main(args);

				break;
			case 3:
				Operations.main(args);
				break;
			}
		}
	}

}
