/*
Accept no from user , check whether no is even positive or odd positive
*/
import java.util.Scanner;
class CheckEvenOdd
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		int no=sc.nextInt();
		
		checkEvenOdd(no);
	
	}
	static void checkEvenOdd(int no)
	{
		if(no>0)//positive
		{
			if(no%2==0)
			{
				System.out.println("no is positive Even");
			}
			else
			{
				System.out.println("no is positive Odd");
			}
			
		}
		else
		{
			if(no%2==0)
			{
				System.out.println("no is Negative Even");
			}
			else
			{
				System.out.println("no is Negative Odd");
			}
		}
	}
}
