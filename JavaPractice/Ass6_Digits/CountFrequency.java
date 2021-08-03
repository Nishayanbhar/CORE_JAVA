/*
3.Write a program which accept number from user and count frequency of 2 in it. 
Input : 2395 
Output : 1 
Input : 1018 
Output : 0 
Input : 9000 
Output : 0 
Input : 922432 
Output : 3 

*/

import java.util.Scanner;
class CountFrequency
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
			if(rem==2)
			{
				count++;
			}
			no=no/10;
		}
		return count;
			
	}
}

/*
D:\CORE_JAVA\JavaPractice\Ass6_Digits>java CountFrequency
Enter no
12224
3

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java CountFrequency
Enter no
10456
0
*/