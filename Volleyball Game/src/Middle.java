import java.util.ArrayList;

public class Middle extends HittersPosition
	{

	public static void whatHappendsToBall(VbStats mb)
		{
		int x = (int) (Math.random() * 5) + 1;
		int index = 0;
		int kills=0;
		int hits=0;
		int errors=0;
		
		if (x == 1)
			{
			// kill and attempt 
			kills = mb.getKills();
			hits = mb.getAttempts();
			errors = mb.getErrors();
			
			kills = kills + 1;
			hits = hits + 1;
			
			mb.setKills(kills);
			mb.setAttempts(hits);
			
			killBall();
			wonPoint++;
			}

		if (x == 2)
			{
			kills = mb.getKills();
			hits = mb.getAttempts();
			errors = mb.getErrors();
			
			errors = errors + 1;
			hits = hits + 1;
			
			mb.setErrors(errors);
			mb.setAttempts(hits);
			
			hitInNet();
			lostPoint++;
			// error and attempt
			}

		if (x == 3)
			{
			kills = mb.getKills();
			hits = mb.getAttempts();
			errors = mb.getErrors();
			
			errors = errors + 1;
			hits = hits + 1;
			
			mb.setErrors(errors);
			mb.setAttempts(hits);
			
			hitOut();
			lostPoint++;
			// error and attempt
			}

		if (x == 4)
			{
			kills = mb.getKills();
			hits = mb.getAttempts();
			errors = mb.getErrors();
			
			errors = errors + 1;
			hits = hits + 1;
			
			mb.setErrors(errors);
			mb.setAttempts(hits);
			
			blockedBall();
			lostPoint++;
			// error and attempt
			}

		if (x == 5)
			{
			kills = mb.getKills();
			hits = mb.getAttempts();
			errors = mb.getErrors();
			
			kills = kills + 1;
			hits = hits + 1;
			
			mb.setKills(kills);
			mb.setAttempts(hits);
			
			killBall();
			wonPoint++;
			// kill and attempt
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
