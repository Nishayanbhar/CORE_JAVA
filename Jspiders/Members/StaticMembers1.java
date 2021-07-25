/*Access Static variables and Methods Demo
*/

class Demo		//Business clas/ function class
{
	static int k=20;
	static void test()
	{
		System.out.println("Test Method");
	}
}
class StaticMembers1	//executable class
{
	public static void main(String args[])
	{
		System.out.println("k value is:" +Demo.k);
		Demo.test();
	}
}