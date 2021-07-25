/*Accept radious from user, radious should be <20, Find area of circle */
import java.util.Scanner;
class ControlDemo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radious");
		double radious=sc.nextDouble();
		
		calArea(radious);
	}
	static void calArea(double radious)
	{
		if(radious<20)
		{
			double area= 3.14*radious*radious;
			System.out.println("Area of Circle:"+area);
		}
		else
		{
			System.out.println("Invalid Radious");
		}
	}
}