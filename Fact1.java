import java.util.Scanner;
class Fact1
{
public static void main(String args[])
{
int choice,f=1,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
choice=sc.nextInt();
while(i<=choice)
{
f=f*i;
i++;
}
System.out.println("Factorial of "+choice+" is = "+f);
}
}
