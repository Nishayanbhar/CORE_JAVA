/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo1
{
	public static void main(String args[])
	{
		if((15>20)&&(5<10)) //as 1st condition is false, jvm will not check 2nd condition, directly return result "false"
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}