package activity9;

import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	System.out.println("Name: Catherine Du \nPeriod: 3 \nDate: April 13th");
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* make change */
		if(selectedCards.size()==3) {
			return containsThreeSum11(selectedCards);
		}
		else if(selectedCards.size()==2) {
			return facePair(selectedCards);
		}
		else {
			return false;
		}
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* make change */
		List<Integer> cIndexes=cardIndexes();
		return containsThreeSum11(cIndexes) || facePair(cIndexes);
	}
	
	private boolean containsThreeSum11(List<Integer> selectedCards) {
		for(int sk1=0; sk1<selectedCards.size(); sk1++) {
			int k1=selectedCards.get(sk1).intValue();
			for(int sk2=sk1+1; sk2<selectedCards.size(); sk2++) {
				int k2=selectedCards.get(sk2).intValue();
				for(int sk3=sk2+1; sk3<selectedCards.size(); sk3++) {
					int k3=selectedCards.get(sk3).intValue();
					if(cardAt(k1).pointValue()+cardAt(k2).pointValue()+cardAt(k3).pointValue()==11) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** 
		for(int sk1=0; sk1<selectedCards.size(); sk1++) {
			int k1=selectedCards.get(sk1).intValue();
			for(int sk2=sk1+1; sk2<selectedCards.size(); sk2++) {
				int k2=selectedCards.get(sk2).intValue();
				if(cardAt(k1).pointValue()+cardAt(k2).pointValue()==11) {
					return true;
				}
			}
		}
		return false;
	}
	*/

	private boolean facePair(List<Integer> selectedCards) {
		int foundJack=0;
		int foundQueen=0;
		int foundKing=0;
		for(Integer kObj:selectedCards) {
			int k=kObj.intValue();
			if(cardAt(k).rank().equals("jack")) {
				foundJack+=1;
			}
			else if(cardAt(k).rank().equals("queen")) {
				foundQueen+=1;
			}
			else if(cardAt(k).rank().equals("king")) {
				foundKing+=1;
			}
		}
		if(foundJack>=2 ||foundQueen>=2 ||foundKing>=2) {
			return true;
		}
		else return false;
	}
	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** 
		boolean foundJack=false;
		boolean foundQueen=false;
		boolean foundKing=false;
		for(Integer kObj:selectedCards) {
			int k=kObj.intValue();
			if(cardAt(k).rank().equals("jack")) {
				foundJack=true;
			}
			else if(cardAt(k).rank().equals("queen")) {
				foundQueen=true;
			}
			else if(cardAt(k).rank().equals("king")) {
				foundKing=true;
			}
		}
		return foundJack&&foundQueen&&foundKing;
	}
	 */
}
