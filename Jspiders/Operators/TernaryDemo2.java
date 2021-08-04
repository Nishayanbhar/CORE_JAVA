/*
 Accept int color choice from user and print color name
*/
import java.util.Scanner;
class TernaryDemo2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.RED \n 2.GREEN\n 3.BLUE\n");
		System.out.println("Enter choice:");
		int choice= sc.nextInt();
		
		String result=(choice==1)? "RED":((choice==2)? "GREEN" :(choice==3)? "BLUE":"INVALID");
		System.out.println(result);
		
	}
}
/*
D:\CORE_JAVA\Jspiders\Operators>java TernaryDemo2
1.RED
 2.GREEN
 3.BLUE

Enter choice:
2
GREEN

D:\CORE_JAVA\Jspiders\Operators>java TernaryDemo2
1.RED
 2.GREEN
 3.BLUE

Enter choice:
5
INVALID
*/