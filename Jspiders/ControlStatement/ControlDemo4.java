/*
laptop= 5% GST
mob= 10% off
*/
import java.util.Scanner;
class ControlDemo4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter qty:");
		int qty=sc.nextInt();
		
		System.out.println("select type of product:\n 1. Laptop \n 2. Mobile");
		int choice= sc.nextInt();
		
		if(choice==1)
		{
			laptopBill(price,qty);
		}
		else if(choice==2)
		{
			mobileBill(price,qty);
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
	}
	
	static void laptopBill(double price, int qty)
	{
		double total= price*qty;
		double GST= 0.05*total;	
		double finalBill= total+GST;
		System.out.println("......Laptop Bill Details:........");
		System.out.println("Total:" +total);
		System.out.println("GST:" +GST);
		System.out.println("final Bill:" +finalBill);
		
	}
	static void mobileBill(double price, int qty)
	{
		double total= price*qty;
		double discount= 0.1*total;	
		double finalBill= total-discount;
		
		System.out.println("......Mobile Bill Details:........");
		System.out.println("Total:" +total);
		System.out.println("Discount:" +discount);
		System.out.println("final Bill:" +finalBill);
		
	}
}
