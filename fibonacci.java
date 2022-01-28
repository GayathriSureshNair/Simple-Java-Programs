import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		int i,n,a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Fibonacci series");
		System.out.println("Enter the number of numbers");
		n=obj.nextInt();
		a=0;
		b=1;	
		System.out.println(n+" numbers of fibonacci series are");
		if(n==1)
			System.out.println("0");
		for(i=0;i<n-1;i++)
		{
			if(i==0)
				System.out.println("0");
			if(i==1)
				System.out.println("1");
			else
			{
				c=a+b;
				a=b;	
				b=c;
				System.out.println(c);
			}
		}
	}
}
