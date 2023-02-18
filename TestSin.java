public class TestSin
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		double b = Math.sin(a);
		double c = Math.cos(a);
		double d = Math.pow(b, 2);
		double e = Math.pow(c, 2);

		System.out.println(d + e);


	}
}