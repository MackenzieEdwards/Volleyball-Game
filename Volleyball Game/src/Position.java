import java.util.Timer;
import java.util.TimerTask;

public class Position
	{

	static int yourTeam = 0;
	static int myTeam = 0;
	static int wonPoint = 0;
	static int lostPoint = 0;

	public static void main(String[] args)
		{

		System.out
				.println("This program will generate a volleyball game. It will do a play-by-play on your team, then it will print out the score.");
		System.out.println();
		thePlay();
		}

	public static void thePlay()
		{
		final Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask()
			{
				@Override
				public void run()
					{

					do
						{
						int x = (int) (Math.random() * 3) + 1;

						if (x == 1)
							{
							Libero.passBall();
							setter.setToMiddle();
							Middle.whatHappendsToBall();
							}
						if (x == 2)
							{
							DS.passBall();
							setter.setToOutside();
							Outside.whatHappendsToBall();
							}
						if (x == 3)
							{
							Libero.passBall();
							setter.setToRightside();
							Rightside.whatHappendsToBall();
							}
						System.out.println("The score is " + wonPoint + "-"
								+ lostPoint + ".");
						System.out.println();

						} while (wonPoint < 25 && lostPoint < 25);

					if (wonPoint == 25)
						{
						System.out.println("You won the game!");
						timer.cancel();
						} 
					else
						{
						System.out.println("I'm sorry lost the game.");
						timer.cancel();

						}
					System.out.println("The final score is " + wonPoint + "-"
							+ lostPoint + ".");
					}
			}, 8000, 8000);
		}
	}
