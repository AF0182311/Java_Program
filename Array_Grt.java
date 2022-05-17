import java.util.Scanner;
class Array_Grt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int k=0;
System.out.println("Enter array size:");
int size=sc.nextInt();
int arr1[]=new int[size];
System.out.println("Enter a number:");
for(int i=0;i<size;i++)
{
     arr1[i]=sc.nextInt();
}
int extra=arr1[k];
for(int j=0;j<size;j++)
{
     if(extra<arr1[j])
      {
     extra=arr1[j];
       }
 
}
System.out.println("Greater number from whole array is:"+extra);
}
}


