package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card first = new Card("heart", "A", 4);
		Card second = new Card("diamond", "B", 7);
		Card third = new Card("heart", "A", 4);
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(first.matches(third));
		System.out.println(first.matches(second));
	}
}
