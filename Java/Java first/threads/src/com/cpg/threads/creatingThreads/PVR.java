package com.cpg.threads.creatingThreads;

public class PVR {

//	void confirmTicket()
//	{
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(i);
//		}
//	}
	
//	void confirmTicket()
//	{
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(i);
//			try {
//				Thread.sleep(700);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}
	
	synchronized void confirmTicket()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	synchronized void leaveMe()
	{
		System.out.println("notify called");
		notify();
	}
}
