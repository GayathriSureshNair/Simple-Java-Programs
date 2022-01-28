import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int n,i,sum,r,R,temp;
		R=1;
		sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("To check whether a number is an armstrong number");
		System.out.println("Enter the number");
		n=obj.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			R=r*r*r;
			sum=sum+R;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("The number is an armstrong number");
		else
			System.out.println("The number is not an armstrong number");
	}
} 		
