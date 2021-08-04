/* Bitwise & Operator Demo
	c=a&b
	c=?
*/
import java.util.Scanner;
class BitwiseDemo2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int a=33;	
		int b=23;
		int c= a&b;
		
		System.out.println(c);		
	}
}
/* 
			  32 16  8  4  2  1
 a=33     33-> 1  0  0  0  0  1
 b=23	  23-> 0  1  0  1  1  1
	      ______________________
 c= a&b     -> 0  0  0  0  0  1 
 c=1
*/