package com.cpg.threads.creatingThreads;

public class TestC {

	public static void main(String[] args) {
		System.out.println("Started");
		PVR p=new PVR();
		User u=new User(p);
		u.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		p.leaveMe();
		System.out.println("Ended");
		
	}

}
