/*
 5.Write a program which accept number from user and return difference between 
summation of even digits and summation of odd digits. 
Input : 2395 
Output : -15 (2 - 17) 
Input : 1018 
Output : 6 (8 - 2) 
Input : 8440 
Output : 16 (16 - 0) 
Input : 5733 
Output : -18 (0 - 18 
*/

import java.util.Scanner;
class SumDiff
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		int result=count(no);
		System.out.println(result);
		
		
	}
	
	static int count(int no)
	{
		int evenSum=0,oddSum=0,diff=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				evenSum=evenSum+rem;
			}
			else
			{
				oddSum=oddSum+rem;
			}
			no=no/10;
		}
		diff=evenSum-oddSum;
		return diff;
			
	}
}

/*
D:\CORE_JAVA\JavaPractice\Ass6_Digits>java SumDiff
Enter no
1018
6

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java SumDiff
Enter no
5733
-18

*/