import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int a,b,sum;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the numbers to be added");
		a=obj.nextInt();
		b=obj.nextInt();
		sum=a+b;
		System.out.println("The sum of the given numbers is = "+sum);
	}
}
