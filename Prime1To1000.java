class Prime1To1000
{
public static void main(String args[])
{
int count=0,j=2;
while(j<=1000)                         
{
   for(int i=2;i<=j;i++)
    {             
       if(j%i==0)             
         {
           count++;      
                      
           }
            
         }
           if(count==1)
                {
                  System.out.println(j);
                 }
         count=0;
    j++;
}
}
}

