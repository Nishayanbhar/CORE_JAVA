/* calculate net salary and gross salary*/
import java.util.Scanner;
class ScannerDemo4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter basic salary:");
		double basicSal= sc.nextDouble();
		
		System.out.println("Enter HRA:");
		double HRA= sc.nextDouble();
		
		System.out.println("Enter insentives Amt:");
		double insentives= sc.nextDouble();
		
		System.out.println("Enter PF Amt:");
		double PF= sc.nextDouble();
		
		System.out.println("Enter proffesional Tax:");
		double proffTax= sc.nextDouble();
		
		double grossSal= grossSalary(basicSal, HRA, insentives);
		System.out.println("Gross Salary:" +grossSal);
		
		double netSal= netSalary(basicSal, HRA, insentives, PF, proffTax);
		System.out.println("Net Salary:" +netSal);

	}
	
	static double grossSalary(double basicSal, double HRA, double insentives)
	{
		double grossSal= basicSal+HRA+insentives;
		return grossSal;
	}
	static double netSalary(double basicSal, double HRA, double insentives, double PF, double proffTax)
	{
		double netSal= basicSal+HRA+insentives-PF-proffTax;
		return netSal;
	}
	
}