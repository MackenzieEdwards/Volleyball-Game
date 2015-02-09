public class Rightside extends HittersPosition
	{
	public static void whatHappendsToBall()
		{

		int x = (int) (Math.random() * 5) + 1;

		if (x == 1)
			{
			killBall();
			wonPoint++;
			// kill and attempt
			}

		if (x == 2)
			{
			hitInNet();
			lostPoint++;
			// error and attempt
			}

		if (x == 3)
			{
			hitOut();
			lostPoint++;
			// error and attempt
			}

		if (x == 4)
			{
			blockedBall();
			lostPoint++;
			// error and attempt
			}

		if (x == 5)
			{
			killBall();
			wonPoint++;
			// kill and attempt
			}
		}

	public static void killBall()
		{
		System.out.println("The rightside got a kill!");
		}

	public static void hitInNet()
		{
		System.out.println("The rightside hit the ball in the net.");
		}

	public static void hitOut()
		{
		System.out.println("The rightside hit the ball out.");
		}

	public static void blockedBall()
		{
		System.out.println("The rightside was blocked.");
		}
	}
