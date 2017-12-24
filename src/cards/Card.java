package cards;
/**
 * ---------------------------------------------------------------------------
 * File name: Card.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dakota Cowell, cowelld@goldmail.etsu.edu
 * Course:  CSCI 1260-002
 * Creation Date: Feb 22, 2016
 * ---------------------------------------------------------------------------
 */

/**
 * To allow creation of card object which consists of a face and suit
 *
 * <hr>
 * Date created: Feb 22, 2016
 * <hr>
 * @author Dakota Cowell
 */
public class Card
{
	private Face face; //enum variable for the face of a card
	private Suit suit; //enum variable for the suit of a card
	
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 */
	public Card()
	{
//		Set enum variables to their enum value
		face = Face.ACE;
		suit = Suit.SPADES;
	}
	
	
	/**
	 * Copy Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 * @param existingCard
	 */
	public Card(Card existingCard)
	{
//		Set enum variables to the enum values stored in the original Card
		face = existingCard.face;
		suit = existingCard.suit;
	}
	
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 * @param n
	 */
	public Card(int n)
	{
		//Set card face and suit for a card
		face = Face.values()[n%13];
		suit = Suit.values()[n%4];
	}
	
	/**
	 * Returns a string of the card's data      
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * <hr>
	 * @return str 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String str = "the " + face + " of " + suit;
		return str;
	}
}
