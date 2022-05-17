import java.util.Scanner;
class PNZ
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,pos=0,neg=0,zero=0;
System.out.println("Enter the size:");
size=sc.nextInt();
int arr1[]=new int[size];
System.out.println("Enter the number:");
for(int i=0;i<size;i++)
{
      arr1[i]=sc.nextInt();
}
System.out.println("Your number is:");
for(int i=0;i<size;i++)
{
System.out.println(arr1[i]);
}
for(int i=0;i<size;i++)
{
       if(arr1[i]>0)
       {
         pos++;
       }     
      else if(arr1[i]<0)
    {
      neg++;
    }
    else
    {
     zero++;
     }
}
System.out.println("Positive number:"+pos);
System.out.println("Negative number:"+neg);
System.out.println("Zero number:"+zero);
}
}