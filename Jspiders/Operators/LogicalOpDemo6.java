/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo6
{
	public static void main(String args[])
	{
		 int a=5; //6 7 8
		 int b;	  //19 18
		 
		 b= ++a + a++ + a;		//6+6+7
		 if( ((a++ > 10)||(b-- < 15)) ) //(7>10)||(19<15)  ---> FALSE
		 {
			 a--;
			 b++;
		 }
		 System.out.print("a=" +a +" b=" +b);
	}
}