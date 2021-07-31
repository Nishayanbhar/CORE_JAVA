/*
4.Write a program which accept number from user and return summation of all its 
non factors. 
Input : 12 
Output : 50 

Input : 10 
Output : 37 
*/
import java.util.Scanner;

class FactorsSummation
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int no= sc.nextInt();
		
		int sum= calSummation(no);
		System.out.println("summation  of factors are:" +sum);
	}
	static int calSummation(int no)
	{
		int sum=0;
		for(int i=2; i<=no; i++)
		{
			if(no%i!=0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}	
/*
D:\CORE_JAVA\JavaPractice\Ass4_Factors>java FactorsSummation
Enter number:
12
summation  of factors are:50

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java FactorsSummation
Enter number:
10
summation  of factors are:37

D:\CORE_JAVA\JavaPractice\Ass4_Factors>
*/