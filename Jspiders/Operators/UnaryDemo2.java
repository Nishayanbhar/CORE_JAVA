/*Unary opeartor Demo*/
import java.util.Scanner;
class UnaryDemo2
{
	public static void main(String args[])
	{
		int a=2;	//3 4
		int b=1;	//10
		
		b=a++ + ++a + a;	//2+4+4
		System.out.println("a=" +a); //4
		System.out.println("y=" +b); //10
		
	}
}