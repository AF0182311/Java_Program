import java.util.Scanner;
class Min_Max
{
public static void main(String args[])
{
int num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a first number:");
num1=sc.nextInt();
System.out.println("Enter a second number:");
num2=sc.nextInt();
 if(num1>num2)
 { 
   for(int i=num1;i>=num2;i--)
    {
      System.out.println(i);
    }
  }
  else
   {
   for(int i=num1;i<=num2;i++)
      {
         System.out.println(i);
       }
    }
}
}