/*
2.Write a program which accept number from user and display its digits in reverse 
order. 
Input : 2395 
Output : 5 9 3 2 

Input : 1018 
Output : 8 1 0 1 

Input : -1018 
Output : 8 1 0 1 

Input : 9000 
Output : 0 0 0 9 

*/

import java.util.Scanner;
class ReverseDigits
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		reverse(no);
		
	}
	
	static void reverse(int no)
	{
		while(no!=0)
		{
			int rem=no%10;
			System.out.print(rem +" ");
			no=no/10;
		}
			
	}
}

/*
D:\CORE_JAVA\JavaPractice\Ass6_Digits>java ReverseDigits
Enter no
1234
4 3 2 1
D:\CORE_JAVA\JavaPractice\Ass6_Digits>java ReverseDigits
Enter no
12002
2 0 0 2 1
*/