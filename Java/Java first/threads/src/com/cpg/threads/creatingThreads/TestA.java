package com.cpg.threads.creatingThreads;

public class TestA {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		Thread1 t=new Thread1();
		t.start();
		System.out.println("Main ended");

 	}

}
