/*Accept user_name and print*/
import java.util.Scanner;
class ScannerDemo1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String name= sc.next();
		
		System.out.println("name:" +name);
		
	}
}
