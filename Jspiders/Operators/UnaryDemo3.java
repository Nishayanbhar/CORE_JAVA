/*Unary opeartor Demo*/
import java.util.Scanner;
class UnaryDemo3
{
	public static void main(String args[])
	{
		int x=5;	//6 5
		int y=4;	//21
		
		y=x++ + x + --x + x; 		//5+6+5+5
		System.out.println("x=" +x); //5
		System.out.println("y=" +y); //21
		
	}
}