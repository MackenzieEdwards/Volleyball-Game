import java.util.ArrayList;

public class Position
	{

	static int wonPoint = 0;
	static int lostPoint = 0;
	static ArrayList<Integer> kills = new ArrayList<Integer>();
	static ArrayList<Integer> attempts = new ArrayList<Integer>();
	static ArrayList<Integer> errors = new ArrayList<Integer>();

	public static void main(String[] args) throws InterruptedException
		{

		System.out.println("This program will generate a volleyball game.");
		System.out
				.println("It will do a play-by-play on your team, then it will print out the score after every point and it will print out the final score. ");
		System.out
				.println("At the end of the game it will give you the stats of the final game.");
		System.out.println();
		thePlay();
		}

	public static void thePlay() throws InterruptedException
		{
			{
			do
				{
				int x = (int) (Math.random() * 3) + 1;

				if (x == 1)
					{

					Libero.passBall();
					Setter.setToMiddle();
					Middle.whatHappendsToBall();
					}
				if (x == 2)
					{
					DS.passBall();
					Setter.setToOutside();
					Outside.whatHappendsToBall();
					}
				if (x == 3)
					{
					Libero.passBall();
					Setter.setToRightside();
					Rightside.whatHappendsToBall();
					}
				System.out
						.println("Score: " + wonPoint + "-" + lostPoint + ".");
				Thread.sleep(3000);
				System.out.println();

				} while (wonPoint < 25 && lostPoint < 25);

			if (wonPoint == 25)
				{
				System.out.println("You won the game!");

				} 
			else
				{
				System.out.println("I'm sorry you lost the game.");

				}
			System.out.println("The final score is " + wonPoint + "-"
					+ lostPoint + ".");
			}
		}
	}
