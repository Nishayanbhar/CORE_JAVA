/*4. Accept one character from user and convert case of that character. 
Input : a Output : A 
Input : D Output : d*/

import java.util.Scanner;
class ConvertCase
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Char:");
		String str=sc.next();
		char c=str.charAt(0);
		
		converCase(c);
		
	}
	static void converCase(char c)
	{
		int ascii=c;
		if((c>='A')&&(c<='Z'))
		{
			ascii=ascii+32;
			System.out.println((char)ascii);
		}
		else if((c>='a')&&(c<='z'))
		{
			ascii=ascii-32;
			System.out.println((char)ascii);
		}
		else
		{
			System.out.println("Invalid char");
		}
	}
}

/*........OUTPUT.........
Enter Char:
A
a

Enter Char:
S
s

Enter Char:
j
J

Enter Char:
3
Invalid char
*/