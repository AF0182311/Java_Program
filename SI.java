/* In this program we are going to calculate simple interest */
import java.util.Scanner; //This package import scanner class which are used to take input from user at run time.
class SimpleInterest
{
public static void main(String args[])
{
Double principal, rate, time, si;
Scanner get=new Scanner(System.in);
System.out.println("Enter a principal amount:");
principal=get.nextDouble();
System.out.println("Enter a rate:");
rate=get.nextDouble();
System.out.println("Enter a time period:");
time=get.nextDouble();
si=(principal*rate*time)/100;
System.out.println("Simple interest is ="+si);
}
}


