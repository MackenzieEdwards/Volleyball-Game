public class HittersPosition  extends Position{

	public static void killBall() {
		System.out.println("The hitter got a kill!");
	}

	// error
	public static void hitInNet() {
		System.out.println("The hitter hit the ball in the net.");
	}

	public static void hitOut() {
		System.out.println("The hitter hit the ball out.");
	}

	// blocked
	public static void blockedBall() {
		System.out.println("The hitter was blocked.");
	}

}
