package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] r1 = {"jack", "queen", "king"};
		String[] s1 = {"blue", "red"};
		int[] pv1 = {11, 12, 13};
		Deck first = new Deck(r1, s1, pv1);
		System.out.println("toString: " + first.toString());
		System.out.println("isEmpty: " + first.isEmpty());
		System.out.println("size: " + first.size());
		System.out.println("Deal deck: " + first.deal()+"\n");
		
		String[] r2 = {"Ace", "queen", "king"};
		String[] s2 = {"black", "red"};
		int[] pv2 = {1, 12, 13};
		Deck second = new Deck(r2, s2, pv2);
		System.out.println("toString: " + second.toString());
		System.out.println("isEmpty: " + second.isEmpty());
		System.out.println("size: " + second.size());
		System.out.println("Deal deck: " + second.deal()+"\n");
		
		String[] r3 = {"six", "seven", "eight"};
		String[] s3 = {"blue", "black"};
		int[] pv3 = {6, 7, 8};
		Deck third = new Deck(r3, s3, pv3);
		System.out.println("toString: " + third.toString());
		System.out.println("isEmpty: " + third.isEmpty());
		System.out.println("size: " + third.size());
		System.out.println("Deal deck: " + third.deal()+"\n");


		
	}
}
