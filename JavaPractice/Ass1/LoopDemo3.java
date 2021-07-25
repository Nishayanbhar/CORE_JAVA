/*Accept one no from user and print that no of * on screen
*/
import java.util.*;
class LoopDemo3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter no:");
		int no= sc.nextInt();
		display(no);
	}
	static void display(int no)
	{
		for(int i=1;i<=no;i++)
		{
			System.out.print("*" +" ");
		}
	}
}

/*output
7
* * * * * * *
*/