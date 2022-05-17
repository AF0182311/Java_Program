import java.util.Scanner;
class Integ
{
public static void main(String args[])
{
int num,rem=0,even=0,odd=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
num=sc.nextInt();
while(num>0)
{
rem=num%10;
if(rem%2==0)
{
even+=rem;
}
else
{
odd+=rem;
}
num=num/10;
}
System.out.println("Sum of even number:"+even);
System.out.println("Sum of odd number:"+odd);
}
}
