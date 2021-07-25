/*
1.Write a program which accept one number from user and print that number of 
even numbers on screen. 
Input : 7 
Output: 2 4 6 8 10 12 14 
*/
import java.util.Scanner;
class LoopDemo6
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		
		display(no);
		
		
	}
	static void display(int no)
	{
		if(no==0)
		{
			return;
		}
		int evenNo=2;
		for(int i=1;i<=no;i++)
		{
			System.out.print(evenNo +" ");
			evenNo+=2;
		}
	}
}
/*...........OUTPUT...........
Enter no
10
2 4 6 8 10 12 14 16 18 20

Enter no
3
2 4 6

Enter no
0

*/