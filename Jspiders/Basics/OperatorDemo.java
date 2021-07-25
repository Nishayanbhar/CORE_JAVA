/* Check use of binary + operator*/
class OperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(10+10);
		System.out.println(10+10.5);
		System.out.println(20.5+20.3);
		
		System.out.println(50+"java");
		System.out.println(50+20+"java");
		System.out.println("java"+50+20);
		System.out.println("java"+(50+20));
		
		System.out.println('A'+'B');
		System.out.println('A'+20);
		System.out.println('A'+"java");
		System.out.println("core"+"java");
		System.out.println("sql"+true);
		System.out.println("30"+false);
		
		
	}
}