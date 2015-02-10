public class Outside extends HittersPosition
	{
	public static void whatHappendsToBall(VbStats oh)
		{

		int x = (int) (Math.random() * 6) + 1;
		int kills = 0;
		int attempts = 0;
		int errors = 0;

		if (x == 1)
			{
			kills = oh.getKills();
			attempts = oh.getAttempts();
			errors = oh.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			oh.setKills(kills);
			oh.setAttempts(attempts);

			killBall();
			wonPoint++;
			}

		if (x == 2)
			{
			kills = oh.getKills();
			attempts = oh.getAttempts();
			errors = oh.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			oh.setErrors(errors);
			oh.setAttempts(attempts);

			hitInNet();
			lostPoint++;
			}

		if (x == 3)
			{
			kills = oh.getKills();
			attempts = oh.getAttempts();
			errors = oh.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			oh.setErrors(errors);
			oh.setAttempts(attempts);

			hitOut();
			lostPoint++;
			// error and attempt
			}

		if (x == 4)
			{
			kills = oh.getKills();
			attempts = oh.getAttempts();
			errors = oh.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			oh.setErrors(errors);
			oh.setAttempts(attempts);

			blockedBall();
			lostPoint++;
			// error and attempt
			}

		if (x == 5)
			{
			kills = oh.getKills();
			attempts = oh.getAttempts();
			errors = oh.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			oh.setKills(kills);
			oh.setAttempts(attempts);

			killBall();
			wonPoint++;
			// kill and attempt
			}
		if (x == 6)
			{
			kills = oh.getKills();
			attempts = oh.getAttempts();
			errors = oh.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			oh.setKills(kills);
			oh.setAttempts(attempts);

			killBall();
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
