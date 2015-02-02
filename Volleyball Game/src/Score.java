public class Score extends Position{
	public static void generateScore() {
		for (int i = 0; i <= 50; i++) {
			int x = (int) (Math.random() * 2);

			if (x == 0) {
				myTeam++;
			} else {
				yourTeam++;
			}
			System.out.println(myTeam + "-" + yourTeam);
			if (myTeam == 25) {
				System.out.println("You won the game!!!");
				break;
			} else if (yourTeam == 25) {
				System.out.println("You lost!");
				break;
			}
		}
		System.out.println("The final score is: " + myTeam + "-" + yourTeam);
		System.out.print("Total points played: ");
		System.out.println(myTeam + yourTeam);
		System.out.println();
	}
}
