import java.util.Scanner;
class Pallindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,rem=0,sum=0,check;
System.out.println("Enter a number:");
num=sc.nextInt();
check=num;
while(num>0)
{
rem=num%10;
sum=sum*10+rem;
num=num/10;
}
if(check==sum)
{
System.out.println(check+" number is pallindrome");
}
else
{
System.out.println(check+" number is not pallindrome");
}
}
}