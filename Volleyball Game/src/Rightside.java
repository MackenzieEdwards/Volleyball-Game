public class Rightside extends SettersPosition {
	public static void whatHappendsToBall() {
		// System.out.println("The middle hits the ball.");

		for (int i = 0; i < 1; i++) {
			int x = (int) (Math.random() * 4);

			if (x == 0) {
				killBall();
				
			}
			if (x == 1) {
				hitInNet();
				
			}
			if (x == 2) {
				hitOut();
				
			}
			if (x == 3) {
				blockedBall();
				
			}
		}

	}

	// kill
	public static void killBall() {
		System.out.println("The rightside got a kill!");
	}

	// error
	public static void hitInNet() {
		System.out.println("The rightside hit the ball in the net.");
	}

	public static void hitOut() {
		System.out.println("The rightside hit the ball out.");
	}

	// blocked
	public static void blockedBall() {
		System.out.println("The rightside was blocked.");
	}
}
