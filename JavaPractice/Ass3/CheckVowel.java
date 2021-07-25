/*
5. Accept on character from user and check whether that character is vowel 
(a,e,i,o,u) or not. 
Input : E Output : TRUE 
Input : d Output : FALSE 
*/
import java.util.Scanner;
class CheckVowel
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Char:");
		String str=sc.next();
		char c=str.charAt(0);
		
		boolean result=checkVowel(c);
		System.out.println(result);
		
		
	}
	static boolean checkVowel(char c)
	{
		if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
/*........OUTPUT........
Enter Char:
a
true

Enter Char:
I
true


Enter Char:
f
false
*/