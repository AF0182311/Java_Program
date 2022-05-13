import java.util.Scanner;
class Armstrong1TO1000
{
public static void main(String args[])
{
int temp=0,i,j=1,k=1;
while(j<=1000)              
{
while(j>0)               
{ 
i=j%10;                    
temp=temp+(i*i*i);  
j=j/10;                 
}
if(k==temp)     
{
System.out.println(k);
}
j=++k;             
temp=0;
}
}
}