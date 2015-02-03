public class Score extends Position
	{
	public static void generateScore()
		{
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
			if (myTeam == 25)
				{
				break;
				} else if (yourTeam == 25)
				{
				break;
				}

			}
		}
	}
