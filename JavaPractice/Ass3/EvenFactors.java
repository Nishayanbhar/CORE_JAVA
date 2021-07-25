/*Accept 1 no from user and Display its even factors
 Input : 24 
 Output: 1 2 4 6 8 12 */
import java.util.*;
class EvenFactors
{
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter no");
			int no= sc.nextInt();
			display(no);
		}
		static void display(int no)
		{
			if(no<0)
			{
				no= -no;
			}
			for(int i=1; i<=no;i++)
			{
				/*if(no%i==0)
				{
					if(i%2==0)
					{
						System.out.print(i+" ");
					}
				}
				*/
				//another way
				if((no%i==0)&&(i%2==0))
				{
					System.out.print(i+" ");
				}
				
				
			}
			
		}
}
/*........OUTPUT............
Enter no
12
2 4 6 12

Enter no
-20
2 4 10 20
*/
