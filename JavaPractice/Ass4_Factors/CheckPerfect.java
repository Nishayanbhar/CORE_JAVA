/*1.Write a program which accept number from user and check whether that is prfect no or not?. 
*/
import java.util.Scanner;

class CheckPerfect
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int no= sc.nextInt();
		
		boolean isPerfect= check(no);
		System.out.println(isPerfect);
	}
	static boolean check(int no)
	{
		int sum=0;
		for(int i=1; i<=no/2; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
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
D:\CORE_JAVA\JavaPractice\Ass4_Factors>java CheckPerfect
Enter number:
6
true

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java CheckPerfect
Enter number:
12
false

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java CheckPerfect
Enter number:
28
true

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java CheckPerfect
Enter number:
2
false

*/