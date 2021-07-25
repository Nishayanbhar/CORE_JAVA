/*
	declare 2 var as qty(int) and price(double),
	calculate total amount with apply 5% GST;
*/

class VariableDemo3
{
	public static void main(String[] args)
	{
		int qty=3;
		double price=400,total,finalTotal;
		
		total=(qty*price);
		finalTotal=total+(0.05*total);		//5/100=0.05
		
		System.out.println("total bill with GST 5% is:"+finalTotal);
		
		
		
	}
}
