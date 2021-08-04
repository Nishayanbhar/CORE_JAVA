/*Unary opeartor Demo*/
import java.util.Scanner;
class UnaryDemo4
{
	public static void main(String args[])
	{
		int a=4;	//5 6 12
		int b=1;	//2 1
		
		a=b++ + a++ + --b + ++a; 		//1+4+1+6
		System.out.println("a=" +a); //12
		System.out.println("b=" +b); //1
		
	}
}