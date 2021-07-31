/*
5.Write a program which accept number from user and return difference between 
summation of all its factors and non factors. 

Input : 12 
Output : -34 (16 - 50) 
Input : 10 
Output : -29 (8 - 37) 
*/
import java.util.Scanner;

class FactorsDiff
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int no= sc.nextInt();
		
		int difference= calDifference(no);
		System.out.println(+difference);
	}
	static int calDifference(int no)
	{
		int factorsSum=0,nonFactorsSum=0;
		for(int i=1; i<no; i++)
		{
			if(no%i==0)
			{
				factorsSum=factorsSum+i;
			}
			else
			{
				nonFactorsSum=nonFactorsSum+i;
			}
		}
		return (factorsSum-nonFactorsSum);
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