/*Program to print 5 to 1 no on screen*/
import java.util.Scanner;
class LoopDemo2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		display();
		
	}
	static void display()
	{
		for(int i=5; i>=1;i--)
		{
			System.out.print(i +" ");
		}
	}
}
/*OUTPUT*/
/*
5 4 3 2 1
*/