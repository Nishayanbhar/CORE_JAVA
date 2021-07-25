/*calculate Area of Square & Triangle
	square=side*side;
	triangle=base*height
*/

class MethodDemo6
{
	public static void main(String args[])
	{
		areaOfSquare(4);		//side
		areaOfTriangle(5,4);	//base,height
	}
	static void areaOfSquare(int side)
	{
		System.out.println("Area of Square:"+(side*side));
	}
	static void areaOfTriangle(int base, int height)
	{
		System.out.println("Area of Triangle:"+(base*height));
	}
}