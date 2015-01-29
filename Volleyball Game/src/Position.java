public class Position {

	public static void main(String[] args) {
		System.out
				.println("This program will generate a volleyball game. It will do a play-by-play on your team, then it will print out the score.");
		System.out.println();
		Score.generateScore();
		thePlay();
	}

	public static void thePlay() {
		for (int i = 0; i < 5; i++) {
			int x = (int) (Math.random() * 4);

			if (x == 0) {
				Libero.passBall();
				setter.setToMiddle();
				Middle.whatHappendsToBall();
				System.out.println();
			}
			if (x == 1) {
				DS.passBall();
				setter.setToOutside();
				Outside.whatHappendsToBall();
				System.out.println();
			}
			if (x == 2) {
				Libero.passBall();
				setter.setToRightside();
				Rightside.whatHappendsToBall();
				System.out.println();
			}
		}

	}

}
