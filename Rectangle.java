/* In this program we are going to calculate area and perimeter of rectangle */
import java.util.Scanner; //This package import scanner class which are used to take input from user at run time.
class Rectangle
{
public static void main(String args[])
{
Double length, width, perimeter, area;
Scanner get=new Scanner(System.in);
System.out.println("Enter the value of  length:");
length=get.nextDouble();
System.out.println("Enter the value of  width:");
width=get.nextDouble();
area=length*width;
perimeter=2*length*width;
System.out.println("Area of rectangle= "+area);
System.out.println("Perimeter of rectangle= "+perimeter);
}
}

