/* Find Area of Circle (by method Chaining)*/
class MethodDemo10
{
	public static void main(String args[])
	{
		double area=areaOFCircle();
		System.out.println("Area of circle is:" +area);
	}
	static double areaOFCircle()
	{
		double radius=addition(5,2);
		double area= 3.14*radius*radius;
		return area;
	}
	static double addition(int n1, int n2)
	{
		double add=n1+n2;
		return add;
	}
}