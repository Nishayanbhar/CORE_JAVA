/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo8
{
	public static void main(String args[])
	{
		 int x=2;	//3
		 int y=4;	//5 4
		 int z=2;	//9 10 9
		 
		 z= x++ + y++ + x;		//2+4+3
		 if(( ((++z <15)&&(y-- >5)) || ((--z >10)&&(x-- <10)) )){	//(10<15)&&(5>5) || (9>10)
															    //	T && F-> F   ||  F		------>> FALSE
			 x++;
			 y++;
			 z++;
		 }
		
		 System.out.print("x=" +x +" y=" +y +" z=" +z);
	}
}