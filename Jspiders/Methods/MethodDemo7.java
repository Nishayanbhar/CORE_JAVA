/*
conversion from min->sec and sec->min
*/
class MethodDemo7
{
	public static void main(String[] args)
	{
		minToSec(5);
		secToMin(300);
	}
	static void minToSec(int min)
	{
		int sec=min*60;
		System.out.println(min +"min=" +sec +"sec");
	}
	static void secToMin(int sec)
	{
		int min=sec/60;
		System.out.println(sec +"sec=" +min +"min");
	}
}