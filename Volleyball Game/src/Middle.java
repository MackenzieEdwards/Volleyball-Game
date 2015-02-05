public class Middle extends HittersPosition
	{

	public static void whatHappendsToBall()
		{
		int v = (int) (Math.random() * 6) + 1;

		if (v == 1)
			{
			killBall();
			wonPoint++;
			}

		if (v == 2)
			{
			hitInNet();
			lostPoint++;

			}
		if (v == 3)
			{
			hitOut();
			lostPoint++;

			}
		if (v == 4)
			{
			blockedBall();
			lostPoint++;
			}
		if (v == 5)
			{
			killBall();
			wonPoint++;

			}
		if (v == 6)
			{
			HittersPosition.otherTeamError();
			wonPoint++;
			}

		}

	public static void killBall()
		{
		System.out.println("The middle got a kill!");
		}

	public static void hitInNet()
		{
		System.out.println("The middle hit the ball in the net.");
		}

	public static void hitOut()
		{
		System.out.println("The middle hit the ball out.");
		}

	public static void blockedBall()
		{
		System.out.println("The middle was blocked.");
		}

	}
