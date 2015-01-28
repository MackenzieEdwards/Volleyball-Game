public class Score
	{
	public static void generateScore()
		{
		int yourTeam = 0;
		int myTeam = 0;
		for (int i = 0; i <= 50; i++)
			{
			int x = (int) (Math.random() * 2);

			if (x == 0)
				{
				myTeam++;
				} else
				{
				yourTeam++;
				}
			System.out.println(myTeam + "-" + yourTeam);
			if (myTeam == 25)
				{
				System.out.println("You won the game!!!");
				break;
				} 
			else if (yourTeam == 25)
				{
				System.out.println("You lost!");
				break;
				}
			}
		System.out.println("The final score is: " + myTeam + "-" + yourTeam);
		}
	}
