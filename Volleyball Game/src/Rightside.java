public class Rightside extends HittersPosition
	{
	public static void whatHappendsToBall(VbStats rs)
		{

		int x = (int) (Math.random() * 6) + 1;
		int kills = 0;
		int attempts = 0;
		int errors = 0;

		if (x == 1)
			{
			kills = rs.getKills();
			attempts = rs.getAttempts();
			errors = rs.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			rs.setKills(kills);
			rs.setAttempts(attempts);

			killBall();
			wonPoint++;
			// kill and attempt
			}

		if (x == 2)
			{
			kills = rs.getKills();
			attempts = rs.getAttempts();
			errors = rs.getErrors();

			errors = errors + 1;
			attempts = attempts + 1;

			rs.setErrors(errors);
			rs.setAttempts(attempts);
			
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
			kills = rs.getKills();
			attempts = rs.getAttempts();
			errors = rs.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			rs.setKills(kills);
			rs.setAttempts(attempts);

			killBall();
			wonPoint++;
			// kill and attempt
			}
		if (x == 6)
			{
			kills = rs.getKills();
			attempts = rs.getAttempts();
			errors = rs.getErrors();

			kills = kills + 1;
			attempts = attempts + 1;

			rs.setKills(kills);
			rs.setAttempts(attempts);

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
