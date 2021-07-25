/*Implement Method Chaining*/
class MethodDemo3
{
	public static void main(String args[])
	{
		System.out.println("In Main Method");
		printMsg1();
	}
	static void printMsg1()
	{
		System.out.println("Welcome to Jspiders");
		printMsg2();
	}
	static void printMsg2()
	{
		System.out.println("Good morning");
	}
}
