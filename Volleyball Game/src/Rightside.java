public class Rightside extends HittersPosition
	{
	public static void whatHappendsToBall(int hitterKills, int attempts, int errors)
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

	// kill
	public static void killBall(int hitterKills, int hitterAttempts, int hitterErrors)
		{
		System.out.println("The rightside got a kill!");
		}

	// error
	public static void hitInNet(int hitterKills, int hitterAttempts, int hitterErrors)
		{
		System.out.println("The rightside hit the ball in the net.");
		}

	public static void hitOut(int hitterKills, int hitterAttempts, int hitterErrors)
		{
		System.out.println("The rightside hit the ball out.");
		}

	// blocked
	public static void blockedBall(int hitterKills, int hitterAttempts, int hitterErrors)
		{
		System.out.println("The rightside was blocked.");
		}
	}
