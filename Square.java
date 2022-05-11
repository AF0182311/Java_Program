//Write a program to accept a number from user if number is even then display the square
import java.util.Scanner;  //This package import scanner class which are used to take input from user at run time.
class Square
{
public static void main(String args[])
{
int num1,res;
Scanner get=new Scanner(System.in);
System.out.println("Enter a number:");
num1=get.nextInt();
if(num1%5==0)
{
res=num1*num1;
System.out.println("Square of number:"+res);
}
}
}

