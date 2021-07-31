/*calculate Electricity Bill
 1. Resident		rate=4.2/unit
 2. commercial		rate=5.2/unit
 
*/
import java.util.Scanner;

class Electricity
{
	static double resUnitRate=4.2;
	static double commUnitRate=5.2;
	
	double calResidentBill(double currentUnits, double prevUnits)
	{
		double totalUnits= currentUnits-prevUnits;
		double residentBill=totalUnits*resUnitRate;
		return residentBill;
	}
	
	double calCommercialBill(double currentUnits, double prevUnits)
	{
		double totalUnits= currentUnits-prevUnits;
		double commercialBill=totalUnits*commUnitRate;
		return commercialBill;
	}
}

class ElectricityBill
{
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Resident\n 2. Commercial\n Enter Choice:");
		int choice=sc.nextInt();
		
		System.out.println("Enter current Reading");
		double currentUnits=sc.nextDouble();
		
		System.out.println("Enter Previous Reading");
		double prevUnits=sc.nextDouble();
		
		Electricity e1=new Electricity();
		
		if(choice==1)
		{
			double result=e1.calResidentBill(currentUnits,prevUnits);
			System.out.println("Resident Bill:" +result);
		}
		else if(choice==2)
		{
			double result=e1.calCommercialBill(currentUnits,prevUnits);
			System.out.println("Commercial Bill:" +result);
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		
	}
}