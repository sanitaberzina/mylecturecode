public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				System.out.println("Number of i is " + i);
				break;
			}
			System.out.println(i);
		}

		System.out.println("____________________________________________");

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				System.out.println("Number of i is " + i);
				continue;
			}
			System.out.println(i);
		}
	}

}
