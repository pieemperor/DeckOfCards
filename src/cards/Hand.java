/**
 * ---------------------------------------------------------------------------
 * File name: Hand.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dakota Cowell, cowelld@goldmail.etsu.edu
 * Course:  CSCI 1260-002
 * Creation Date: Mar 15, 2016
 * ---------------------------------------------------------------------------
 */

package cards;


/**
 * to create an array of Card objects 
 *
 * <hr>
 * Date created: Mar 15, 2016
 * <hr>
 * @author Dakota Cowell
 */
public class Hand
{
	private int handSize = 0; //variable to store how big the hand can be
	private int cardsInHand = 0; //variable to store how many cards are in a hand
	private Card[] hand; //array to store cards to create the hand
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 */
	public Hand()
	{
		setHandSize(0);//Set handSize to default
		setCardsInHand(0); //Set CardsInHand to default
		setHand(new Card[5]); //Set hand to default
	}//end no-arg constructor
	
	
	/**
	 * to get the handSize
	 * @return handSize
	 */
	public int getHandSize ( )
	{
		return handSize;
	}

	
	/**
	 * to set handSize
	 * @param handSize the handSize to set
	 */
	public void setHandSize (int handSize)
	{
		this.handSize = handSize;
	}

	
	/**
	 * to get the the cardsInHand
	 * @return cardsInHand
	 */
	public int getCardsInHand ( )
	{
		return cardsInHand;
	}

	
	/**
	 * to set the cardsInHand
	 * @param cardsInHand the cardsInHand to set
	 */
	public void setCardsInHand (int cardsInHand)
	{
		this.cardsInHand = cardsInHand;
	}


	
	/**
	 * to get the hand
	 * @return hand 
	 */
	public Card [] getHand ( )
	{
		return hand;
	}

	
	/**
	 * to set the hand
	 * @param hand the hand to set
	 * @return void
	 */
	public void setHand (Card [ ] hand)
	{
		this.hand = hand;
	}
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * @param handSize int to store number of cards in the hand
	 */
	public Hand(int handSize)
	{
		//make sure you dont have more than 52 cards in a hand
		if(handSize < 53)
		{
			setHandSize(handSize);
		}
		else
		{
			setHandSize(5);
		}
		setCardsInHand(0);//Set cardsInHand to default
		setHand(new Card[handSize]); //Set hand to default
	}
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * @param handIn is a Hand object that is passed in to be copied
	 */
	public Hand(Hand handIn)
	{
		setHandSize(handIn.handSize);//set handSize equal to the original handSize
		setCardsInHand(handIn.cardsInHand);//set cardsInHand equal to original cardsInHand
		setHand(new Card[handIn.handSize]);//set hand = to original hand
		for(int i=0; i<handIn.handSize;i++)//set the hands equal to each other
		{
			hand[i] = handIn.hand[i];
		}
		
	}//end copy constructor
	
	/**
	 * to add a card one at a time to a hand
	 * addCard        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * @param card is a Card object to be added to a hand
	 * @return void
	 */
	public void addCard(Card card)
	{
		//Make sure the hand is not full first
		if(cardsInHand < hand.length)
		{
			hand[cardsInHand] = card;//Set the value of one card = to the card passed in
			cardsInHand++;//increment cardsInHand
		}
	}//end addCard method
	
	/**
	 * to convert the hands to String data
	 * toString     
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 */
	public String toString()
	{
		String str = "";//Create string
		
		//Loop through array and add it to the String
		for(int i = 0; i<hand.length; i++)
		{
			str+=hand[i] +"\n";
		}
		return str;//Return String object
	}
}

