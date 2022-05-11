//Write a program to accept a character from user and check if it is vowel or not
import java.util.Scanner;   //This package import scanner class which are used to take input from user at run time.
class Vowel
{
public static void main(String args[])
{
char choice;
Scanner get=new Scanner(System.in);
System.out.println("Enter a choice:");
choice=get.next().charAt(0);
switch(choice)
{
case 'a':
   System.out.println("It is vowel");
  break;
case 'e':
   System.out.println("It is vowel");
  break;
case 'i':
   System.out.println("It is vowel");
  break;
case 'o':
   System.out.println("It is vowel");
  break;
case 'u':
   System.out.println("It is vowel");
  break;
default:
    System.out.println("It is constant");
   break;
}
}
}































