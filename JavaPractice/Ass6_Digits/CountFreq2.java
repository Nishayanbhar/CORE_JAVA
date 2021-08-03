/*
 5.Write a program which accept number from user and count frequency of such a 
digits which are less than 6. 
Input : 2395 
Output : 3 

Input : 1018 
Output : 3 
*/

import java.util.Scanner;
class CountFreq2
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
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem<6)
			{
				count++;
			}
			no=no/10;
		}
		return count;
			
	}
}

/*
D:\CORE_JAVA\JavaPractice\Ass6_Digits>java CountFreq2
Enter no
234578
4

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java CountFreq2
Enter no
10789
2
*/