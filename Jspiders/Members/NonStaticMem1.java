/*Access Non-Static variables and Methods Demo
*/

class Demo		//Business clas/ function class
{
	int k=20;
	void test()
	{
		System.out.println("Test Method");
	}
}
class NonStaticMem1	//executable class
{
	public static void main(String args[])
	{
		System.out.println("k value is:" + new Demo().k); // access by using obj of class
		 new Demo().test();
	}

}