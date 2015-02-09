public class Setter extends SettersPosition
	{
	public static void setBall()
		{

		int x = (int) (Math.random() * 3) + 1;

		if (x == 1)
			{
			setToMiddle();
			}

		if (x == 2)
			{
			setToOutside();
			}

		if (x == 3)
			{
			setToRightside();
			}
		}
	}
