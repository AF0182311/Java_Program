package com.rajneesh;

import java.util.Scanner;

public class Accept {
  int[] arr;
  int n;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		arr=new int[n];
	    System.out.println("Enter the number for array:");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	}
	
	
}
