public class Middle extends HittersPosition {

	public static void whatHappendsToBall() {
		for (int i = 0; i < 1; i++) {
			int v = (int) (Math.random() * 4);

			if (v == 0) {
				killBall();
				
			}
			if (v == 1) {
				hitInNet();
				
			}
			if (v == 2) {
				hitOut();
				
			}
			if (v == 3) {
				blockedBall();
				
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
