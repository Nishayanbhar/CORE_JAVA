/*Devide 2 numbers*/
import java.util.Scanner;
class Division
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int no1= sc.nextInt();
		
		System.out.println("Enter 2nd no:");
		int no2= sc.nextInt();
		
		float division= calDiv(no1, no2);
		if(division==-1)
		{
			System.out.println("Devide by 0 Error");
		}
		else
		{
			System.out.println("Division:" +division);
		}
	}
	static float calDiv(int no1, int no2)
	{
		if(no2==0)
		{
			return -1;
		}
		float result=no1/no2;
		return result;
	}
}

/*output
Enter 1st no:
10
Enter 2nd no:
2
Division:5.0


Enter 1st no:
10
Enter 2nd no:
0
Devide by 0 Error

*/