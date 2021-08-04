/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo3
{
	public static void main(String args[])
	{
		if( (((10<15)||(15>10)) && ((5>10)||(20<30))) )// T&&T ->T
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}