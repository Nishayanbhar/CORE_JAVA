/*Accept 2 no from user and print no 1 of no 2 times*/
import java.util.*;
class LoopDemo5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int no= sc.nextInt();
		
		System.out.println("Enter frequency");
		int freq= sc.nextInt();
		
		display(no,freq);
	}
	static void display(int no, int freq)
	{
		int i=freq;
		for(i=freq;i>=0;i--)
		{
			System.out.print(no +" ");
		}
	}
}
/*OUTPUT*/
/*
Enter no
11
Enter frequency
5
11 11 11 11 11 11

*/