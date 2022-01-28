import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		int n,r,R,temp;
		R=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("To check whether a number is a palindrome");
		System.out.println("Enter a number");
		n=obj.nextInt();
		temp=n;
		while(n!=0)
		{
			R=R*10;
			r=n%10;
			R=R+r;
			n=n/10;
		}
		if(temp==R)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}
