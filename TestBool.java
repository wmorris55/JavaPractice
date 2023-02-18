public class TestBool
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean letsee;
		letsee = (a < b || b < c);

		System.out.println(letsee);

	} 
}