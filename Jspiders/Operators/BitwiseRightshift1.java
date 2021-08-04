/* Bitwise Right Shift Operator Demo
	x=18
	r=x>>3	
*/
import java.util.Scanner;
class BitwiseRightshift1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int x=18;	
		int r=x>>3;		//2
		System.out.println(r);		
	}
}
/* 
 			    16  8  4  2  1
          18->   1  0  0  1  0
			     0	1  0  0  1	(right shift by 1)
				 0  0  1  0  0  (right shift by 2)
				 0  0  0  1  0  (right shift by 3)
	      
*/