/*
Check whether no is positive or negative?
*/
import java.util.Scanner;
class TernaryDemo1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		int no= sc.nextInt();
		
		String result=(no>0)?("POSITIVE"):("NEGATIVE");
		System.out.println(result);
		
	}
}
/*
D:\CORE_JAVA\Jspiders\Operators>java TernaryDemo1
Enter no:
3
POSITIVE

D:\CORE_JAVA\Jspiders\Operators>java TernaryDemo1
Enter no:
-1
NEGATIVE

D:\CORE_JAVA\Jspiders\Operators>*/