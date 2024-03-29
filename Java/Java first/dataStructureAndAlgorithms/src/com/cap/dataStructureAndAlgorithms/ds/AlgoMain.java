package com.cap.dataStructureAndAlgorithms.ds;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class AlgoMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		//int a[]= {1,5,9,7,8,4,6,2,3,15,18,20,45,12,23,19,74,80,11,7,8,9,5,4,6,4,7,5,4,5,2,13,7,5,4,8,6,93,1,2,4,56,8,7,9,4,77,8,9,99,8,4,55,21,4,789,999999999,99999,77777,88888,555555,511122};
		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		while(true) {
		System.out.println("1.Bubble sort\n 2.Merge sort\n");
		int c=sc.nextInt();
		switch(c){
		case 1:
			BubbleSort b=new BubbleSort();
			
			
			CheckDuration.countingDuration2(a);
			break;
		case 2:
			MergeSort m=new MergeSort();
			
			Instant start2=Instant.now();
			m.sort(a, 0, a.length-1);
			System.out.println("Merge sorted array is: ");
			m.printArray(a);
			Instant end2=Instant.now();
			long duration2=Duration.between(start2, end2).toMillis();
			double seconds2=duration2/1000;
			System.out.println("merge "+seconds2+" seconds");
			break;
		}
		}
	}
}
