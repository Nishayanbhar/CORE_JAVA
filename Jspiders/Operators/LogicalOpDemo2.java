/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo2
{
	public static void main(String args[])
	{
		if((10>5)||(5<5)) //as 1st condition is TRUE, jvm will not check 2nd condition, directly return result "TRUE"
		{
			System.out.println("true");// result
		}
		else
		{
			System.out.println("false");
		}
	}
}