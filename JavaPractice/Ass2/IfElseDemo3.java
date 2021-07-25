/*
Accept no from user and if no <10 the print "Hello" otherwise print "Demo"
*/
import java.util.Scanner;
class IfElseDemo3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		check(no);
		
		
	}
	static void check(int no)
	{
		if(no<=10)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Demo");
		}
	}
}
/*OUTPUT*/
/*

Enter no
5
Hello

Enter no
12
Demo

Enter no
0
Hello

*/