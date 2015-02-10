public class Position
	{

	static int wonPoint = 0;
	static int lostPoint = 0;

	static VbStats mb = new VbStats(0, 0, 0);
	static VbStats rs = new VbStats(0, 0, 0);
	static VbStats oh = new VbStats(0, 0, 0);

	public static void main(String[] args) throws InterruptedException
		{
		instructions();

		thePlay(mb, rs, oh);

		BoxScore.stats(mb, rs, oh);
		}

	public static void instructions()
		{
		System.out.println("This program will generate a volleyball game.");
		System.out
				.println("It will do a play-by-play on your team, then it will print out the score after every point and it will print out the final score. ");
		System.out
				.println("At the end of the game it will give you the stats of the final game.");
		System.out.println();
		}

	public static void thePlay(VbStats mb, VbStats rs, VbStats oh)
			throws InterruptedException
		{
			{
			do
				{
				int x = (int) (Math.random() * 3) + 1;

				if (x == 1)
					{
					Libero.passBall();
					Setter.setToMiddle();
					Middle.whatHappendsToBall(mb);
					}
				if (x == 2)
					{
					DS.passBall();
					Setter.setToOutside();
					Outside.whatHappendsToBall(oh);
					}
				if (x == 3)
					{
					Libero.passBall();
					Setter.setToRightside();
					Rightside.whatHappendsToBall(rs);
					}
				System.out
						.println("Score: " + wonPoint + "-" + lostPoint + ".");
				// Thread.sleep(2000);

				System.out.println();

				} while (wonPoint < 25 && lostPoint < 25);

			if (wonPoint == 25)
				{
				System.out.println("You won the game!");
				} else
				{
				System.out.println("I'm sorry you lost the game.");

				}
			System.out.println("The final score is " + wonPoint + "-"
					+ lostPoint + ".");
			}
		}
	}
