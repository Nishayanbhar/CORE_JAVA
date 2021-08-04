/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo7
{
	public static void main(String args[])
	{
		 int x=10;	//9 10 9 8
		 int y=2;	//29 30	  
		 
		 y= x-- + x + ++x;		//10+9+10
		 if( ((x-- >10)&&(y++ <20)) )	//(10>10) condition false, so JVM will ignore 2nd condition and jump to else
		 {
			 x++;
			 y--;
		 }
		 else
		 {
			 y++;	//30
			 x--;	//8
		 }
		 System.out.print("x=" +x +" y=" +y);
	}
}