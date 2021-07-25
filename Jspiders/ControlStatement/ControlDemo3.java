/* Accept n1 and n2 from user and perform:
   1 = addition
   2= subtraction
 */
import java.util.Scanner;
class ControlDemo3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd no");
		int n2=sc.nextInt();
		
		System.out.println("select mode of operation:\n 1. Addition \n 2.subtraction");
		int choice= sc.nextInt();
		
		if(choice==1)
		{
			addition(n1,n2);
		}
		else if(choice==2)
		{
			subtraction(n1,n2);
		}
		else
		{
			System.out.println("Invalid choice");
		}
				
	}
	
	static void addition(int n1, int n2)
	{
		int add= n1+n2;
		System.out.println("Addition is:" +add);
		
	}
	static void subtraction(int n1, int n2)
	{
		int sub= n1-n2;
		System.out.println("Subtraction is:" +sub);
		
	}
	
}