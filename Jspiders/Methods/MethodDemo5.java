/*implement method with arguments*/
class MethodDemo5
{
	public static void main(String args[])
	{
		account("nisha");
	}
	static void account(String name)
	{
		System.out.println("welcome\t" +name);
		System.out.println("Acc created successfully");
		profile();
		
	}
	static void profile()
	{
		System.out.println("profile created successfully");
	}
}