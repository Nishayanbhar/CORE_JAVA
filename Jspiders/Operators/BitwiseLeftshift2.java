/* Bitwise Left Shift Operator Demo
	
*/
import java.util.Scanner;
class BitwiseLeftshift2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int x=24;	
		int y=12;
		int r=x&y;		//8
		int z=r<<4;		//8<<4=128
		System.out.println(r);	
		System.out.println(z);
	}
}
/* 

			  32 16  8  4  2  1
 x=24     24-> 0  1  1  0  0  0
 y=12	  12-> 0  0  1  1  0  0
	      ______________________
 r=x&y      -> 0  0  1  0  0  0 
 c=8

 for each 1 bit left shift mul current no x 2
		8*2  = 16   (shift by 1)
		16*2  = 32  (shift by 2)
		32*2 = 64  (shift by 3)
		64*2 = 128  (shift by 4)
	
		
*/