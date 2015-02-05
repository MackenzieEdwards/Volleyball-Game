public class Rightside extends HittersPosition {
	public static void whatHappendsToBall() {

		int x = (int) (Math.random() * 5) + 1;

		if (x == 1) {
			killBall();

			wonPoint++;

		}
		if (x == 2) {
			hitInNet();
			lostPoint++;

		}
		if (x == 3) {
			hitOut();
			lostPoint++;
		}
		if (x == 4) {
			blockedBall();
			lostPoint++;
		}
		if (x == 5) {
			killBall();
			wonPoint++;

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
