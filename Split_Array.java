import java.util.Scanner;
class Split_Array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size;
System.out.println("Enter the size of array:");
size=sc.nextInt();
int arr1[]=new int[size];
int arr2[]=new int[size/2];
int arr3[]=new int[size/2];
int k=size/2;
System.out.println("Enter the array elements:");
for(int i=0;i<size;i++)
{
      arr1[i]=sc.nextInt();
}
System.out.println("Your array1 elements:");
for(int i=0;i<size/2;i++)
{
   arr2[i]=arr1[i];
System.out.println(arr2[i]);
}
System.out.println("Your array2 elements:");
for(int i=0;i<size/2;i++)
{
arr3[i]=arr1[k];
System.out.println(arr3[i]);
k++;
}
}
}
