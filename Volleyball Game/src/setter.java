public class setter extends SettersPosition {
	public static void setBall() {

			int x = (int) (Math.random() * 2);

			if (x == 0) {
				setToMiddle();

			}
			if (x == 1) {
				setToOutside();

			}
			if (x == 2) {
				setToRightside();

			}
		
	}


	public static void setToMiddle() {
		System.out.println("The setter sets to the middle.");
	}

	public static void setToOutside() {
		System.out.println("The setter sets to the outside.");
	}

	public static void setToRightside() {
		System.out.println("The setter sets to the rightside.");
	}
}
