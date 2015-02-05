public class DS extends PassersPosition
	{
	public static void passBall()
		{
		for (int i = 0; i < 1; i++)
			{
			int v = (int) (Math.random() * 3);

			if (v == 0)
				{
				goodPass();

				}
			if (v == 1)
				{
				badPass();
				}
			if (v == 2)
				{
				okPass();
				}
			}
		}

	public static void goodPass()
		{
		System.out.println("The defensive specialist made a good pass!");
		}

	public static void badPass()
		{
		System.out.println("The defensive specialist made a bad pass.");
		}

	public static void okPass()
		{
		System.out.println("The defensive specialist made an OK pass.");
		}
	}
