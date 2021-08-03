/*
3.Write a program which accept number from user and count frequency of 2 in it. 
 
Input : 2395 
Output : There is no Zero 

Input : 1018 
Output : It Contains Zero 

Input : 9000 
Output : It Contains Zero 

Input : 10687 
Output : It Contains Zero
*/

import java.util.Scanner;
class isContainsZero
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		boolean result=check(no);
		System.out.println(result);
		
		
	}
	
	static boolean check(int no)
	{
		int rem=0;
		while(no!=0)
		{
			rem=no%10;
			if(rem==0)
			{
				break;
			}
			no=no/10;
		}
		if(rem==0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
}

/*

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java isContainsZero
Enter no
1234
false

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java isContainsZero
Enter no
2304
true

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java isContainsZero
Enter no
2200003
true

D:\CORE_JAVA\JavaPractice\Ass6_Digits>java isContainsZero
Enter no
01
false
*/