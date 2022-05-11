/*Write a program to accept age and gender from user and display ROI(Rate of Interest) (for male above 60 : 7%) (for female above 60 : 7.5%) (for male and female below 60 : 5%) */
import java.util.Scanner;   //This package import scanner class which are used to take input from user at run time.
import java.lang.Character;
class ROI
{ 
public static void main(String args[])
{
int age;
char gender;
Scanner get=new Scanner(System.in);

System.out.println("Enter a age:");
age=get.nextInt();
System.out.println("Enter a gender:");
gender=Character.toLowerCase(get.next().charAt(0));
if(age>60)
{
    if(gender=='m')
    {
      System.out.println("Interest Rate is 7%");
    }
   else
   {
      System.out.println("Interest Rate is 7.5%");
   }
}
else
{
System.out.println("Interest Rate is 5 %");
}
}
}


