import java.util.Scanner;
class Reversed
{
public static void main(String args[])
{
int num,rem=0,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
num=sc.nextInt();
while(num>0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("Reverse number="+rev);
}
}