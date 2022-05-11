//Write a program to accept a number from user and check it is even or odd
import java.util.Scanner; //This package import scanner class which are used to take input from user at run time.
class Even_Odd
{
public static void main(String args[])
{
int num1,num2;
Scanner get=new Scanner(System.in);
System.out.println("Enter a number :");
num1=get.nextInt();
if(num1%2==0)
{
System.out.println(num1+" is a even number");
}
else
{
System.out.println(num1+" is a odd number");
}
}
}
