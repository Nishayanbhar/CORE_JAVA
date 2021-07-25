/*
	display choice:
	1. area of square
	2. area of Rect
	and display result
*/
import java.util.Scanner;
class Cal_Area
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Select Mode of Operation: \n 1. Area of Circle \n 2. Area of rectangle");
		int choice=sc.nextInt();
		
		if(choice== 1)
		{
			System.out.println("Enter Side:");
			double side=sc.nextInt();
			areaOfSquare(side);
		}
		else if(choice==2)
		{
			System.out.println("Enter length:");
			double len=sc.nextInt();
			
			System.out.println("Enter breath:");
			double breath=sc.nextInt();
			areaOfRect(len, breath);
		}
		else
		{
			System.out.println("Invalid choice");
		}	
		
	}
	 static void areaOfSquare(double side)
	 {
		 double areaOfSquare= side*side;
		 System.out.println("Area Of Square:" +areaOfSquare);
		 
	 }
	 
	 static void areaOfRect(double len, double breath)
	 {
		 double areaOfRect= len*breath;
		 System.out.println("Area Of Rectangle:" +areaOfRect);
		 
	 }
	
	
	
}
