package com.cpg.threads.creatingThreads;

public class IRCTC {

	synchronized void confirmTicket()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
			
		}
		
		
	}
	
	synchronized void leaveMe()
	{
		System.out.println("notify called");
		notifyAll();
	}
}
