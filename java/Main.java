package four;


import java.util.Scanner;

import one.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		obj.accept();
	}

	public void accept()
	{
		
		Scanner sc=new Scanner(System.in);
	    Factorial f=new Factorial();
	    System.out.println("Enter a number for factorial:");
	    int n=sc.nextInt();
	    f.fact(n);
	    int a,b;
	    System.out.println("Enter two number for arithmetic operation:");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println("Enter operator:");
	    char c=sc.next().charAt(0);
		f.arithmetic(c,a,b);
		System.out.println("Enter a size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		two.Greater.greater(arr);
	     three.Vowel obj1=new three.Vowel();
	     System.out.println("Enter a character:");
	     char ch=sc.next().charAt(0);
	     obj1.vowel(ch);
	}
}
