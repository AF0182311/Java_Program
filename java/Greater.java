package com.rajneesh;

public class Greater extends Accept{

	public void greater()
	{
		accept();
		int temp=arr[0];
		for(int i=0;i<n;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("Greater number is :"+temp);
	}
	
	
}
