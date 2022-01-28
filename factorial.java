import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		int n,i,fact;
		fact=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("The factorial of "+n+" is "+fact);
	}
}
