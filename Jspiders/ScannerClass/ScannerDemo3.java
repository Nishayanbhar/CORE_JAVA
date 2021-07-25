/*Accept Sentence and print*/
import java.util.Scanner;
class ScannerDemo3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName= sc.nextLine();
		
		System.out.println("name:" +fullName);
		
	}
}
