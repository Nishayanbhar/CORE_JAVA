/* Create one extrenal method and call from main()*/
public class MethodDemo2
{
	public static void main(String[] args)
	{
		System.out.println("Main method");
		display();
	}
	
	static void display()
	{
		System.out.println("Display method");
	}
}