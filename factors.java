import java.util.*;
class factors
{
	public static void main(String args[])
	{
		int n,i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		n=obj.nextInt();
		System.out.println("The factors of the number "+n+" are");
		for(i=1;i<=n;i++)
			if(n%i==0)
				System.out.println(i);
	}
}
