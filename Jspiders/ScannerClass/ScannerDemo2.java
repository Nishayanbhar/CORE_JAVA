/*Accept 2 strings from user and print multiplication*/
import java.util.Scanner;
class ScannerDemo2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st no");
		int no1=sc.nextInt();
		
		System.out.println("Enter 2nd no");
		int no2=sc.nextInt();
		
		int mul=no1*no2;
		System.out.println("Multiplication:" +mul);
		
	}
}
