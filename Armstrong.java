import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp=0,i,choice,choice1;
System.out.println("Enter a number:");
choice=sc.nextInt();
choice1=choice;
while(choice>0)                 
{
i=choice%10;
temp=temp+i*i*i;
choice=choice/10;
}
if(choice1==temp)
{
System.out.println(choice1+" is armstrong number");
}
else
{
System.out.println(choice1+" is not armstrong number");
}
}
}