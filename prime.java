import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int n,i,count;
		count=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				count=count+1;
		}
		if(count==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
}
