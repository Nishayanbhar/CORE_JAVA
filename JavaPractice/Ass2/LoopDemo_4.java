/*Accpet 1 no from user and print that no of * on screen
 Using while loop*/

import java.util.*;
class LoopDemo_4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no:");
		int no= sc.nextInt();
		display(no);
	}
	static void display(int no)
	{
		int i=1;
		while(i<=no)
		{
			System.out.print("*" +" ");
			i++;
		}
	}
}

/*OUTPUT*/
/*
enter no:
3
* * *
*/