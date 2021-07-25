/*Accept 1 no and check whether no is divisible by 5 or not??*//*Program to print 5 to 1 no on screen*/

import java.util.Scanner;
class CheckDivBy5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		boolean result= check(no);
		
		if(result==true)
		{
			System.out.println("Divisible by 5");
		}
		else{
			System.out.println("Not Divisible by 5");
		}
		
	}
	static boolean check(int no)
	{
		if(no%5==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

/*.....................OUTPUT...........................*/
/*
Enter no:
15
Divisible by 5

D:\JavaPractice>java CheckDivBy5
Enter no:
13
Not Divisible by 5
*/