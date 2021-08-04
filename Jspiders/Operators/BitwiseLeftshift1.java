/* Bitwise Left Shift Operator Demo
	x=28
	r=x<<5	
*/
import java.util.Scanner;
class BitwiseLeftshift1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int x=28;	
		int r=x<<5;		//896
		System.out.println(r);		
	}
}
/* 
 for each 1 bit left shift mul current no x 2
		28*2  = 56   (shift by 1)
		56*2  = 112  (shift by 2)
		112*2 = 224  (shift by 3)
		224*2 = 448  (shift by 4)
		448*2 = 896  (shift by 5)
		
*/