/*Accept no from user and check whether it is even or not??*/
import java.util.*;
class IfElseDemo4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int no= sc.nextInt();
		
		boolean result=check(no);
		System.out.println(result);
	}
	static boolean check(int no)
	{
		if(no%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
/*OUTPUT*/
/*
Enter no
12
true

Enter no
3
false
*/