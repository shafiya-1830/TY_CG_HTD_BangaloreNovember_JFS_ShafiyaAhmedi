package com.cpg.threads.creatingThreads;

public class TestD {

	public static void main(String[] args) {


		System.out.println("Started");
		IRCTC i1=new IRCTC();
		
		User1 u1=new User1(i1);
		u1.start();
		i1.leaveMe();
		User1 u2=new User1(i1);
		u2.start();
		
		i1.leaveMe();
		
		
		System.out.println("ended");

	}

}
