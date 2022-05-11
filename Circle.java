/*In this program we are going to find area and circumference of circle */
import java.util.Scanner; //This package import scanner class which are used to take input from user at run time.
import java.lang.Math.*;
class Area
{
public static void main(String args[])
{
Double radius,circumference,circle;
Scanner get=new Scanner(System.in);
System.out.println("Enter value of radius:");
radius=get.nextDouble();
circumference=2*Math.PI*radius;
System.out.println("Circumference of circle= "+circumference);
circle=Math.PI*radius*radius;
System.out.println("Area of circle= "+circle);
}
}
