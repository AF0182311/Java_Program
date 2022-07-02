package com.rajneesh;

public class Pallindrome extends Accept {

	public void pallindrome()
	{
		accept();
		int a=arr[0];
		int sum=0;
		int j=a;
		while(a>0)
		{
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		if(j==sum)
		{
			System.out.println(j+" is pallindrome number");
		}
		else
		{
			System.out.println(j+" is not pallindrome number");
		}
	}
}
