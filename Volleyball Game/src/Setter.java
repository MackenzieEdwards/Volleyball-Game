public class Setter extends SettersPosition
	{
	public static void setBall()
		{

		int x = (int) (Math.random() * 2);

		if (x == 0)
			{
			setToMiddle();

			}
		if (x == 1)
			{
			setToOutside();

			}
		if (x == 2)
			{
			setToRightside();

			}

		}
	}
