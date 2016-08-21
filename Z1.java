class Z1
{
	public static void main(String args[])
	{
		int a=5,b=0,c;
		try
		{
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e);
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}