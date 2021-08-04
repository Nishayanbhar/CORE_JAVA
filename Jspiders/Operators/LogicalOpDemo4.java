/*Logical  opeartor Demo*/
import java.util.Scanner;
class LogicalOpDemo4
{
	public static void main(String args[])
	{
		if( !(('A'>20)&&('B'<100)) ) //T && T-> T	and !T->F
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false"); // result
		}
	}
}