/* calculate bill with 5% discount on total bill*/
class MethodDemo8
{
	public static void main(String args[])
	{
		laptopBill(2,40000);
		mobBill(2,10000);
	}	
	static void laptopBill(int qty,double price)
	{
		double total=qty*price;
		double discount= total*0.1;
		total=total-discount;
		System.out.println("laptop_Bill:" +total);
	}
	static void mobBill(int qty,double price)
	{
		double total=qty*price;
		double discount= total*0.05;
		total=total-discount;
		System.out.println("mob_Bill:" +total);
	}
}