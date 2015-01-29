public class Outside extends HittersPosition {
	public static void whatHappendsToBall() {

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
		System.out.println("The outside got a kill!");
	}

	// error
	public static void hitInNet() {
		System.out.println("The outside hit the ball in the net.");
	}

	// hits out
	public static void hitOut() {
		System.out.println("The outside hit the ball out.");
	}

	// blocked
	public static void blockedBall() {
		System.out.println("The outside was blocked.");
	}
}
