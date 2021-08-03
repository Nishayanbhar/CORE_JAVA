/*
1.Write a program which accept number from user and display no in reverse 
order. 
Input : 2395 
Output : 5932


Input : 9000 
Output : 9 

*/

import java.util.Scanner;
class ReverseNo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		int result=reverse(no);
		System.out.println(result);
		
		
	}
	
	static int reverse(int no)
	{
		int reverseNo=0;
		while(no!=0)
		{
			int rem=no%10;
			reverseNo=reverseNo*10+rem;
			no=no/10;
		}
		return reverseNo;
			
	}
}

/*

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java ReverseNo
Enter no
1234
4321

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java ReverseNo
Enter no
1100
11
*/