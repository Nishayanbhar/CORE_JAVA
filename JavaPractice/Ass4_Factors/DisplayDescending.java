/*
2.Write a program which accept number from user and display its factors in 
decreasing order. 
Input : 12 
Output : 6 4 3 2 1 

Input : 13 
Output : 1 

Input : 10 
Output : 5 2 1 
*/

import java.util.Scanner;

class DisplayDescending
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int no= sc.nextInt();
		
		display(no);
		
	}
	static void display(int no)
	{
		for(int i=no/2; i>=1; i--)
		{
			if(no%i==0)
			{
				System.out.print(i +" ");
			}
		}
		
	}
}	
/*
D:\CORE_JAVA\JavaPractice\Ass4_Factors>javac DisplayDescending.java

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java DisplayDescending
Enter number:
10
5 2 1
D:\CORE_JAVA\JavaPractice\Ass4_Factors>java DisplayDescending
Enter number:
12
6 4 3 2 1
D:\CORE_JAVA\JavaPractice\Ass4_Factors>

*/