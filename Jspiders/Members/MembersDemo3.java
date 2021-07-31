/*
Select Operation and and display result
1. Area Of Circle= pi*r*r
2. Circumference of circle= 2*pi*r
*/
import java.util.Scanner;

class Circle
{
	static double pi=3.14;
	
	double calArea(double radious)
	{
		double circleArea=pi*radious*radious;
		return circleArea;
	}
	double calCircumference(double radious)
	{
		double circleCircumference=2*pi*radious;
		return circleCircumference;
	}
}

class MembersDemo3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Circle c1=new Circle();
		
		System.out.println("1. Area of Circle\n 2. Circumference of Circle\n Enter Choice:");
		int choice=sc.nextInt();
		
		System.out.println("Enter Radiuos");
		double radious=sc.nextFloat();
		
		if(choice==1)
		{
			double result=c1.calArea(radious);
			System.out.println("Area of Circle:"+result);
		}
		else if(choice==2)
		{
			double result=c1.calCircumference(radious);
			System.out.println("Circumference of Circle:"+result);
			
		}
		else{
			System.out.println("Invalid choice");
		}
			
		
	}
}