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
		Score.generateScore();
		thePlay();
		}

	public static void thePlay()
		{
			for (int i = 0; i <= yourTeam + myTeam; i++)
				{

				int x = (int) (Math.random() * 3) + 1;

				if (x == 1)
					{
					Libero.passBall();
					setter.setToMiddle();
					Middle.whatHappendsToBall();
					System.out.println(yourTeam);
					System.out.println();
					}
				if (x == 2)
					{
					DS.passBall();
					setter.setToOutside();
					Outside.whatHappendsToBall();
					System.out.println();
					}
				if (x == 3)
					{
					Libero.passBall();
					setter.setToRightside();
					Rightside.whatHappendsToBall();
					System.out.println();
					}
				wonPoint = myTeam;
				lostPoint = yourTeam;
			}
		System.out.println("The final score is " + wonPoint + "-" + lostPoint);

		}

	}
