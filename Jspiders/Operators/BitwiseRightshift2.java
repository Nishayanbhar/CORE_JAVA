/* Bitwise Left Shift Operator Demo
	
*/
import java.util.Scanner;
class BitwiseRightshift2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int x=25;	
		int y=15;
		int z=x|y;		//31
		int r=z>>2;		//31>>2= 7
		System.out.println(r);	
		System.out.println(z);
	}
}
/* 

			  32 16  8  4  2  1
 x=25     25-> 0  1  1  0  0  1
 y=15	  15-> 0  0  1  1  1  1
	      ______________________
 z=x|y      -> 0  1  1  1  1  1 -->>31
 
				 
				  16  8  4  2  1
             31->  1  1  1  1  1
				   0  1  1  1  1  (shift by 1)
				   0  0  1  1  1   (shift by 2)  --> 7
	      

 
 
	
		
*/