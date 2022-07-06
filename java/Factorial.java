package one;

public class Factorial {

	
	public void fact(int n)
	{
		int j=n;
		int f=1;
		while(n>0)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factorial of "+j+" is:"+f);
	}
	public void arithmetic(char c,int a,int b)
	{
		switch(c)
		{
		case '+':
			System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
			break;
		case '-':
			System.out.println("The Subtraction of "+a+" and "+b+" is "+(a-b));
			break;
		case '*':
			System.out.println("The Multiplication of "+a+" and "+b+" is "+(a*b));
			break;
		case '/':
			System.out.println("The Division of "+a+" and "+b+" is "+(a/b));
			break;
		case '%':
			System.out.println("The Modulus of "+a+" and "+b+" is "+(a%b));
			break;
		default:
			System.out.println("Please enter a valid operator");
			break;
		}
	}
	
	
}
