import java.util.*;
class sumofn
{
	public static void main(String args[])
	{
		int n,i,sum;
		sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number upto which it should be added");
		n=obj.nextInt();
		for(i=0;i<=n;i++)
			sum=sum+i;
		System.out.println("The sum of numbers upto "+n+" is "+sum);
	}
}  
