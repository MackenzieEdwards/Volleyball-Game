public class Middle extends HittersPosition
	{
	public static void whatHappendsToBall(VbStats mb)
		{
		int x = (int) (Math.random() * 6) + 1;
		int kills = 0;
		int attempts = 0;
		int errors = 0;

		if (x == 1)
			{

			kills = mb.getKills();
			attempts = mb.getAttempts();
			errors = mb.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			mb.setKills(kills);
			mb.setAttempts(attempts);

			killBall();
			wonPoint++;
			}

		if (x == 2)
			{
			kills = mb.getKills();
			attempts = mb.getAttempts();
			errors = mb.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			mb.setErrors(errors);
			mb.setAttempts(attempts);

			hitInNet();
			lostPoint++;

			}

		if (x == 3)
			{
			kills = mb.getKills();
			attempts = mb.getAttempts();
			errors = mb.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			mb.setErrors(errors);
			mb.setAttempts(attempts);

			hitOut();
			lostPoint++;
			}

		if (x == 4)
			{
			kills = mb.getKills();
			attempts = mb.getAttempts();
			errors = mb.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			mb.setErrors(errors);
			mb.setAttempts(attempts);

			blockedBall();
			lostPoint++;
			// error and attempt
			}

		if (x == 5)
			{
			kills = mb.getKills();
			attempts = mb.getAttempts();
			errors = mb.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			mb.setKills(kills);
			mb.setAttempts(attempts);

			killBall();
			wonPoint++;
			// kill and attempt
			}
		if (x == 6)
			{

			kills = mb.getKills();
			attempts = mb.getAttempts();
			errors = mb.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			mb.setKills(kills);
			mb.setAttempts(attempts);

			killBall();
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
