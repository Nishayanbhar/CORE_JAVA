/*1.Write a program which accept number from user and display its multiplication of factors. 
Input : 12 
Output : 144 (1 * 2 * 3 * 4 * 6) 

Input : 13 
Output : 1 (1) 

Input : 10 
Output : 10 (1 * 2 * 5)
*/
import java.util.Scanner;

class FactorsMult
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int no= sc.nextInt();
		
		int mult= calMult(no);
		System.out.println("Multiplication of factors are:" +mult);
	}
	static int calMult(int no)
	{
		int mult=1;
		for(int i=2; i<=no/2; i++)
		{
			if(no%i==0)
			{
				mult=mult*i;
			}
		}
		return mult;
	}
}	
/*
D:\CORE_JAVA\JavaPractice\Ass4_Factors>javac FactorsMult.java

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java FactorsMult
Enter number:
12
Multiplication of factors are:144

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java FactorsMult
Enter number:
13
Multiplication of factors are:1

D:\CORE_JAVA\JavaPractice\Ass4_Factors>java FactorsMult
Enter number:
10
Multiplication of factors are:10
*/