/* Swap 2 variabls: x=25, x=50*/
class VariableDemo5
{
	public static void main(String args[])
	{
		
		int temp,x1=25,x2=50;
		System.out.println("before swapping\n" +x1 +"\t" +x2);
		
		//using temp variable
		temp=x1;
		x1=x2;
		x2=temp;
		System.out.println("after swapping \n" +x1 +"\t" +x2);
		
		//without temp
		x1=x1+x2;
		x2=x1-x2;
		x1=x1-x2;
		System.out.println("after swapping \n" +x1 +"\t" +x2);
	}
}