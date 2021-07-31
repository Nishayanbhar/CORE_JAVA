/*
3.Write a program which accept number from user and display all its non factors. 
Input : 12 
Output : 5 7 8 9 10 11 

Input : 13 
Output : 2 3 4 5 6 7 8 9 10 11 12 

Input : 10 
Output : 3 4 6 7 8 9*/

import java.util.Scanner;

class DisplayNonFactors
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
		for(int i=1; i<=no; i++)
		{
			if(no%i!=0)
			{
				System.out.print(i +" ");
			}
		}
		
	}
}	
/*
D:\CORE_JAVA\JavaPractice\Ass4_Factors>javac DisplayNonFactors.java

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java DisplayNonFactors
Enter number:
13
2 3 4 5 6 7 8 9 10 11 12
D:\CORE_JAVA\JavaPractice\Ass4_Factors>java DisplayNonFactors
Enter number:
10
3 4 6 7 8 9
D:\CORE_JAVA\JavaPractice\Ass4_Factors>
*/