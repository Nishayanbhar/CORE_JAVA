/* Print marvellous 5 times*/
import java.util.Scanner;
class LoopDemo1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		display();
		
	}
	static void display()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("Marvellous");
		}
	}
}
/*OUTPUT*/
/*
Marvellous
Marvellous
Marvellous
Marvellous
Marvellous
*/