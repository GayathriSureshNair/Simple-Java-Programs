import java.util.*;
class oddeven
{
	public static void main(String args[])
	{
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		n=obj.nextInt();
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	} 
}
