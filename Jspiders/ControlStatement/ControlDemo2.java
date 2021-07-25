/* Accept 2 int, and find large*/

import java.util.Scanner;
class ControlDemo2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println(" n1 is greater than n1");
		}
		else if(n2>n1)
		{
			System.out.println(" n2 is greater than n1");
		}
		else
		{
			System.out.println(" n1 is equal to n2");
		}
		
	}
}