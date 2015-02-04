public class Rightside extends HittersPosition {
	public static void whatHappendsToBall() {

		//for (int i = 0; i < 1; i++) {
			int x = (int) (Math.random() * 5) + 1;

			if (x == 1) {
				killBall();
				// System.out.println("Won Point.");
				wonPoint++;

			}
			if (x == 2) {
				hitInNet();
				// System.out.println("Lost Point.");
				lostPoint++;

			}
			if (x == 3) {
				hitOut();
				// System.out.println("Lost Point.");
				lostPoint++;
			}
			if (x == 4) {
				blockedBall();
				// System.out.println("Lost Point.");
				lostPoint++;
			}
			if (x == 5) {
				killBall();
				// System.out.println("Won Point.");
				wonPoint++;

			}
//			if (wonPoint == 25) {
//				// System.out.println("You won the game!");
//				break;
//			}
//			if (lostPoint == 25) {
//				// System.out.println("You lost the game!");
//				break;
//			}
//
//		}

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
