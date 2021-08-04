/*Unary opeartor Demo*/
import java.util.Scanner;
class UnaryDemo1
{
	public static void main(String args[])
	{
		int x=5;	//6
		int y=2;	//
		
		y=x++;		//y=5 6
		System.out.println("y=" +y);
		
		x= ++y;		//x=6
		System.out.println("x=" +x);
		
	}
}