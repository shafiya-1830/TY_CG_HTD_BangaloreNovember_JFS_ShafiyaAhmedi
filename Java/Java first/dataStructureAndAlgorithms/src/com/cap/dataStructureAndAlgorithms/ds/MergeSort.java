package com.cap.dataStructureAndAlgorithms.ds;

public class MergeSort {

	void merge(int a[],int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;
		int Left[]=new int[n1];
		int Right[]=new int[n2];
		for(int i=0;i<n1;i++)
			Left[i]=a[l+i];
		for(int j=0;j<n2;j++)
			Right[j]=a[m+1+j];
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(Left[i]<=Right[j]) {
				a[k]=Left[i];
				i++;
			}
			else{
				a[k]=Right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=Left[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k]=Right[j];
			j++;
			k++;
		}
	}

	void sort(int a[],int l,int r){
		if(l<r){
			int m=(l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}
	}

	void printArray(int a[]){
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		System.out.println();
	}
}

