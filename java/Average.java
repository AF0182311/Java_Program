package com.rajneesh;

public class Average extends Accept {

	public void average()
	{
		int sum=0;
		accept();
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Average is :"+sum/n);
	}
	
	
}
