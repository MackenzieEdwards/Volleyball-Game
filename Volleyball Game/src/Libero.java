public class Libero extends PassersPosition
	{
	public static void passBall()
		{
		int v = (int) (Math.random() * 3) + 1;

		if (v == 1)
			{
			goodPass();

			}
		if (v == 2)
			{
			badPass();
			}
		if (v == 3)
			{
			okPass();
			}
		}

	public static void goodPass()
		{
		System.out.println("The libero made a good pass!");
		}

	public static void badPass()
		{
		System.out.println("The libero made a bad pass.");
		}

	public static void okPass()
		{
		System.out.println("The libero made an OK pass.");
		}

	}
