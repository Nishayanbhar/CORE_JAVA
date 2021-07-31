/*Practical 2:*/

import java.util.Scanner;

class Hotel
{
	static double costForVeg=2500;
	static double costForNonVeg=3000;
	static double acCharges=200;
	static double nonacCharges=300;
	
	double ac_Veg(int qty)
	{
		double totalBill= (qty*costForVeg)+acCharges;
		double GST= totalBill*0.12;
		double finalBill=totalBill+GST;
		return finalBill;
	}
	double ac_NonVeg(int qty)
	{
		double totalBill= (qty*costForNonVeg)+acCharges;
		double GST= totalBill*0.12;
		double finalBill=totalBill+GST;
		return finalBill;
	}
	double nonac_Veg(int qty)
	{
		double totalBill= (qty*costForVeg)+nonacCharges;
		double GST= totalBill*0.12;
		double finalBill=totalBill+GST;
		return finalBill;
	}
	double nonac_NonVeg(int qty)
	{
		double totalBill= (qty*costForNonVeg)+nonacCharges;
		double GST= totalBill*0.12;
		double finalBill=totalBill+GST;
		return finalBill;
	}
	
	
}

class Resto2
{
	public static void main(String args[])
  {

	Scanner sc=new Scanner(System.in);
	Hotel h=new Hotel();
	
	System.out.println("Select Resto type:\n 1.AC \n 2. NonAC");
	int acChoice=sc.nextInt();
	
	if((acChoice==1)||(acChoice==2))	
		
	{
		System.out.println("Select Menu type:\n 1.Veg \n 2. NonVeg");
		int menuChoice=sc.nextInt();
		
		if((menuChoice==1)||(menuChoice==2))
		{
			if((acChoice==1)&&(menuChoice==1))		//ac+veg
			{
				System.out.println("Enter dish qty");
				int qty=sc.nextInt();
	
				double finalBill= h.ac_Veg(qty);
				System.out.println("final Bill is:" +finalBill);
			}
			else if((acChoice==1)&&(menuChoice==2))	//ac+nonveg
			{
				System.out.println("Enter dish qty");
				int qty=sc.nextInt();
	
				double finalBill= h.ac_NonVeg(qty);
				System.out.println("final Bill is:" +finalBill);
			}
			else if((acChoice==2)&&(menuChoice==1))	//Nonac+veg
			{
				System.out.println("Enter dish qty");
				int qty=sc.nextInt();
	
				double finalBill= h.nonac_Veg(qty);
				System.out.println("final Bill is:" +finalBill);
			}
			else if((acChoice==2)&&(menuChoice==2))	//Nonac+veg
			{
				System.out.println("Enter dish qty");
				int qty=sc.nextInt();
	
				double finalBill= h.nonac_NonVeg(qty);
				System.out.println("final Bill is:" +finalBill);
			}
			
		}//end of if
		else							//Invalid Menu choice
		{
			System.out.println("Invalid Choice");	
		}//end of else
	}//end of if
	else								//invalid AC_Choice
	{
		System.out.println("Invalid Choice");
	}// end of else
		
  }//end of main
}//end of class