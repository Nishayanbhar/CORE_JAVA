/*Practical 2:*/

import java.util.Scanner;

class Hotel
{
	static double costForVeg=2500;
	static double costForNonVeg=3000;
	static double acCharges=200;
	static double nonacCharges=300;
	
	Scanner sc=new Scanner(System.in);
	
	double calBill(int acChoice, int menuChoice)
	{
		if((acChoice==1)&&(menuChoice==1))	//Ac+Veg
		{
			System.out.println("Enter Veg Dish Quantity:");
			int qty=sc.nextInt();
			
			double totalBill= (qty*costForVeg)+acCharges;
			double GST= totalBill*0.12;
			double finalBill=totalBill+GST;
			return finalBill;
			
			
		}
		
		else if((acChoice==1)&&(menuChoice==2))	//Ac+NonVeg
		{
			System.out.println("Enter Non-Veg Dish Quantity:");
			int qty=sc.nextInt();
			
			double totalBill= (qty*costForNonVeg)+acCharges;
			double GST= totalBill*0.12;
			double finalBill=totalBill+GST;
			return finalBill;
			
			
		}
		
		else if((acChoice==2)&&(menuChoice==1))	//NonAc+Veg
		{
			System.out.println("Enter Veg Dish Quantity:");
			int qty=sc.nextInt();
			
			double totalBill= (qty*costForVeg)+nonacCharges;
			double GST= totalBill*0.12;
			double finalBill=totalBill+GST;
			return finalBill;
			
			
		}
		
		else if((acChoice==2)&&(menuChoice==2))	//NonAc+NonVeg
		{
			System.out.println("Enter Non Veg Dish Quantity:");
			int qty=sc.nextInt();
			
			double totalBill= (qty*costForNonVeg)+nonacCharges;
			double GST= totalBill*0.12;
			double finalBill=totalBill+GST;
			return finalBill;
			
			
		}
		else
		{
			return -1;
		}
		
		
	}
	
	
	
}

class Resto
{
	public static void main(String args[])
  {

	Scanner sc=new Scanner(System.in);
	Hotel h=new Hotel();
	System.out.println("Select Resto type:\n 1.AC \n 2. Non-AC");
	int acChoice=sc.nextInt();
	
	System.out.println("Select Menu type:\n 1.Veg \n 2. Non-Veg");
	int menuChoice=sc.nextInt();
	
	double finalBill=h.calBill(acChoice,menuChoice);
	if(finalBill==-1)
	{
		System.out.println("Select Valid choice");
	}
	else
	{
	System.out.println("Total Bill with 12% GST:" +finalBill);
	}
  }
}