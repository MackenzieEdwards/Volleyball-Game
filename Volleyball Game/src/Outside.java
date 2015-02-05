public class Outside extends HittersPosition
	{
	public static void whatHappendsToBall()
		{

		int x = (int) (Math.random() * 6) + 1;

		if (x == 1)
			{
			killBall();
			wonPoint++;
			}

		if (x == 2)
			{
			hitInNet();
			lostPoint++;
			}

		if (x == 3)
			{
			hitOut();
			lostPoint++;
			}

		if (x == 4)
			{
			blockedBall();
			lostPoint++;
			}

		if (x == 5)
			{
			killBall();
			wonPoint++;
			}

		if (x == 6)
			{
			HittersPosition.otherTeamError();
			wonPoint++;
			}

		}

	public static void killBall()
		{
		System.out.println("The outside got a kill!");
		}

	public static void hitInNet()
		{
		System.out.println("The outside hit the ball in the net.");
		}

	public static void hitOut()
		{
		System.out.println("The outside hit the ball out.");
		}

	public static void blockedBall()
		{
		System.out.println("The outside was blocked.");
		}
	}
