/* Variable Re-initializarion Demo*/
class VariableDemo4
{
	public static void main(String args[])
	{
		char ch1='Q', ch2='S', ch3='P';
		System.out.println(ch1 +"\t" +ch2 +"\t" +ch3);
		
		ch1=ch3;
		ch3=ch2;
		ch2=ch1;
		System.out.println(ch1 +"\t" +ch2 +"\t" +ch3); //after re-initializarion
		
	}	
}