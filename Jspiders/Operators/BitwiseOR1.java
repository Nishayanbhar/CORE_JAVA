/* Bitwise | OR Operator Demo
	c=a|b
	c=?
*/
import java.util.Scanner;
class BitwiseOR1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int a=5;	
		int b=9;
		int c= a&b;	//1
		int d= 37|c; //37
		
		System.out.println(d);		
	}
}
/* 
			  32 16  8  4  2  1
 a=5      33-> 0  0  0  1  0  1
 b=9	  23-> 0  0  1  0  0  1
	      ______________________
 c= a&b     -> 0  0  0  0  0  1 
 c=1
 
			  32 16  8  4  2  1
          37-> 1  0  0  1  0  1
          1 -> 0  0  0  0  0  1
	      ______________________
 d= 37|1    -> 1  0  0  1  0  1  -->37  
*/