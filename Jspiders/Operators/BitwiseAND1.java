/* Bitwise & Operator Demo
	c=a&b
	c=?
*/
import java.util.Scanner;
class BitwiseAND1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int a=12;	
		int b=8;
		int c= a&b;
		
		System.out.println(c);		
	}
}
/* 
			   8 4 2 1
 a= 12    12-> 0 1 1 0
 b=8	   8-> 0 1 0 0
	      ______________
 c= a&b     -> 0 1 0 0
 c=8
*/