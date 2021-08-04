/*Unary opeartor Demo*/
import java.util.Scanner;
class UnaryDemo5
{
	public static void main(String args[])
	{
		int a=2;	// 3 4 5
		int b=3;	//9 10
		
		b= a++ + a + ++a; 		//2+3+4
		
		if(b++ < 15)	//if(9<15)
		{
			a++;	//
			
		}
		else
		{
			b--;
		}
		System.out.println("a=" +a); // 5 
		System.out.println("b=" +b); // 10
		
	}
}