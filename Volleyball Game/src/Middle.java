public class Middle extends HittersPosition {

	public static void whatHappendsToBall() {
		for (int i = 0; i < 1; i++) {
			int v = (int) (Math.random() * 6);

			if (v == 0) {
				killBall();
				System.out.println("Won Point.");
				wonPoint++;

			}
			if (v == 1) {
				hitInNet();
				System.out.println("Lost Point.");

			}
			if (v == 2) {
				hitOut();
				System.out.println("Lost Point.");

			}
			if (v == 3) {
				blockedBall();
				System.out.println("Lost Point.");
			}
			if (v == 4) {
				killBall();
				System.out.println("Won Point.");
				wonPoint++;

			}
			if (v == 5) {
				killBall();
				System.out.println("Won Point.");
				wonPoint++;
			}
		}
	}

	// kill
	public static void killBall() {
		System.out.println("The middle got a kill!");
	}

	// error
	public static void hitInNet() {
		System.out.println("The middle hit the ball in the net.");
	}

	public static void hitOut() {
		System.out.println("The middle hit the ball out.");
	}

	// blocked
	public static void blockedBall() {
		System.out.println("The middle was blocked.");
	}

}
