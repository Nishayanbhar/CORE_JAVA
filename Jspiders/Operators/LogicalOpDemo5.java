/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo5
{
	public static void main(String args[])
	{
		if( (!((5<3)||(3>5))) && (!((10>20)||(30<10))) ) // !F && !F ->T
		{
			System.out.println("true"); //result
		}
		else
		{
			System.out.println("false"); // 
		}
	}
}