/*Method with return type String
  return concatinated string from function to main*/
class MethodDemo9
{
	public static void main(String args[])
	{
		String output=test();
		System.out.println("output is:" +output);
	}
	static String test()
	{
		String s1="CORE";
		String s2="JAVA";
		return(s1+s2);
		
	}
}