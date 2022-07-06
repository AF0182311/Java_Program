package two;

public class Greater {

	
	
	public static void greater(int[] a)
	{
		//int t=a.length;
		int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(temp<a[i])
			{
				temp=a[i];
			}
		}
		System.out.println("Greater number is :"+temp);
	}
}
