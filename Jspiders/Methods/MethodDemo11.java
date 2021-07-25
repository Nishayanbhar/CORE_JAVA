/* calculate percentage(method chaining)*/
class MethodDemo11
{
	public static void main(String args[])
	{
		double per=calPercentage(80,75,90);
		System.out.println("Percentage:" +per);
	}
	
	static double calPercentage(double m1, double m2, double m3)
	{
		double totMarks=calTotalMarks(m1,m2,m3);
		double per= (totMarks/300)*100;
		return per;
	}
	
	static double calTotalMarks(double m1, double m2, double m3)
	{
		double totMarks=m1+m2+m3;
		return totMarks;
	}
}