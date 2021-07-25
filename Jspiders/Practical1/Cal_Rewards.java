/*
Calculate rewards points= dwinCount+lossCount+drawCount;
winCount=winCount*25
lossCount=lossCount *-5
drawCount =drawCount*10
*/
import java.util.Scanner;
class Cal_Rewards
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter total no wins:");
		int winCount=sc.nextInt();
		
		System.out.println("Enter total no loss:");
		int lossCount=sc.nextInt();
		
		System.out.println("Enter total no draws:");
		int drawCount=sc.nextInt();
		
		cal_Rewards(winCount,lossCount,drawCount);
		
	}
	
	static void cal_Rewards(int winCount, int lossCount, int drawCount)
	{
		int result= ((winCount*25)+(lossCount* -5)+(drawCount*10));
		System.out.println("Reward:" +result);
		
	}
}
