// Write a program to accept two number and choice from user for arithmetic operators  
import java.util.Scanner;   //This package import scanner class which are used to take input from user at run time.
class Arithmetic_Operatorsr
{
public static void main(String args[])
{
Double num1;
Double num2;
char op;
Double result;
Scanner get=new Scanner(System.in);
System.out.println("Enter first number:");
num1=get.nextDouble();
System.out.println("Enter second number:");
num2=get.nextDouble();
System.out.println("Enter the operator which you want to perform such as +  -  *  /  % :");
op=get.next().charAt(0);
switch(op)
{
case '+':
result=num1+num2;
System.out.println("Addition of two number is="+result);
break;
case '-':
result=num1-num2;
System.out.println("Addition of two number is="+result);
break;
case '*':
result=num1*num2;
System.out.println("Addition of two number is="+result);
break;
case '/':
result=num1/num2;
System.out.println("Addition of two number is="+result);
break;
case '%':
result=num1%num2;
System.out.println("Addition of two number is="+result);
break;
default:
System.out.println("Please enter valid operator");
break;
}
}
}
