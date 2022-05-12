import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice,count=0,i=1;
System.out.println("Enter a number:");
choice=sc.nextInt();
while(i<=choice)
{
   if(choice%i==0)
    {
    count++;
    }
    i++;
}
if(count==2)
{
System.out.println(choice+" is prime number");
}
else
{
System.out.println(choice+" is not  prime number");
}
}
}

