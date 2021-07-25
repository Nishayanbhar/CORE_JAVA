/*perform arithmetic operations using Method Chaining
 n1=20, n2=10*/

class MethodDemo4
{
	
	public static void main(String args[])
	{
		additon(20,10);
		
	}
	static void additon(int n1,int n2)
	{
		System.out.println("Addition:" +(n1+n2));
		subtraction(n1,n2);
	}
	static void subtraction(int n1,int n2)
	{
		System.out.println("Subtraction:"+(n1-n2));
		multiplication(n1,n2);
	}
	static void multiplication(int n1,int n2)
	{
		System.out.println("Multiplication:"+(n1*n2));
		division(n1,n2);
	}
	static void division(int n1,int n2)
	{
		System.out.println("Division:" +(n1/n2));
		modulo(n1,n2);
	}
	static void modulo(int n1,int n2)
	{
		System.out.println("modulo:" +(n1%n2));
	}
}