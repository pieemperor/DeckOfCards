/**
 * ---------------------------------------------------------------------------
 * File name: Deck.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dakota Cowell, cowelld@goldmail.etsu.edu
 * Course:  CSCI 1260-002
 * Creation Date: Feb 24, 2016
 * ---------------------------------------------------------------------------
 */

package cards;
import java.util.Random;

/**
 * Used to create a deck of cards from the Card class
 *
 * <hr>
 * Date created: Feb 24, 2016
 * <hr>
 * @author Dakota Cowell
 */
public class Deck
{
	//Create array to store 52 Cards
	private Card[] deck = new Card[52];
	private int nextCard; //Into to keep track of which card to deal
	
	
	
	/**
	 * @return deck
	 */
	public Card [ ] getDeck ( )
	{
		return deck;
	}


	
	/**
	 * @param deck the deck to set
	 */
	public void setDeck (Card [ ] deck)
	{
		this.deck = deck;
	}


	
	/**
	 * @return nextCard
	 */
	public int getNextCard ( )
	{
		return nextCard;
	}


	
	/**
	 * @param nextCard the nextCard to set
	 */
	public void setNextCard (int nextCard)
	{
		this.nextCard = nextCard;
	}


	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 */
	Deck()
	{
		//Initialize the deck
		setDeck(new Card[52]);
		
		//Loop through 52 times
		for(int i = 0; i<52;i++)
		{
			//Set the values in the array to Card values
			deck[i] = new Card(i);
		}
		//Initialize nextCard to 0
		setNextCard(0);
	}
	
	
	/**
	 * Copy Constructor        
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * 
	 * @param existingDeck
	 */
	public Deck(Deck existingDeck)
	{	
		for(int i = 0; i < 52; i++)
		{
//			Set the new array equal to the old array
			setDeck(existingDeck.deck);
		}
	}
	
	/**
	 * Method to shuffle the cards.  This will swap the cards' places       
	 *
	 * <hr>
	 * Date created: Mar 2, 2016
	 *
	 * <hr>
	 */
	public void shuffle()
	{
		//Create a Random object
		Random rand = new Random();
		for(int i = 0; i<52; i++)
		{
			Card temp;//Variable to temporarily hold the value for a spot in the array
			//Set temp equal to the number you're swapping
			temp = deck[i]; 
			//Generate a random number and save it in a variable
			int randomNumber = rand.nextInt(51);
			//Set the number in the array equal to a randomly selected other number
			deck[i] = deck[randomNumber];
			//Place the temporary value where the other value used to be
			deck[randomNumber] = temp;
		}		
		
		//Repeat for better shuffling
		for(int i = 0; i<52; i++)
		{
			Card temp;
			temp = deck[i];
			int randomNumber = rand.nextInt(51);
			deck[i] = deck[randomNumber];
			deck[randomNumber] = temp;
		}
		
		//Repeat for better shuffling
		for(int i = 0; i<52; i++)
		{
			Card temp;
			temp = deck[i];
			int randomNumber = rand.nextInt(51);
			deck[i] = deck[randomNumber];
			deck[randomNumber] = temp;
		}
		nextCard = 0;//Reset the deck
	}
	
	/**
	 * Method to return a string of the cards we have stored in our array       
	 *
	 * <hr>
	 * Date created: Mar 2, 2016 
	 *
	 * <hr>
	 * @return str a String to store the deck
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String str =""; //variable to store the values in deck
		for(int i = 0;i<52; i++)
		{
//			set string equal to the string + the value in that space in the array
			str = str + deck[i] + "\n";
		}
		return str;
	}
	
	/**
	 * Will return a single card from the deck      
	 *
	 * <hr>
	 * Date created: Mar 2, 2016
	 *
	 * <hr>
	 * @return 
	 */
	public Card dealACard()
	{
		int number = nextCard;//variable to keep track of which card to deal
		//make sure nextCard doesn't increment over 51
		if(nextCard < 52)
		{
			nextCard ++;//increment nextCard
		}
		//return the card in the the right position
		return deck[number];
	}
	
	/**
	 * Method to return multiple cards    
	 *
	 * <hr>
	 * Date created: Mar 2, 2016
	 *
	 * <hr>
	 * @param handSize number of cards in the hand
	 * @return player Hand object to store the array of cards
	 */
	public Hand dealAHand(int handSize)
	{
		int cardsDealt = 0; //variable to keep track of cards dealt
		Hand player = new Hand(handSize);//Create a hand object
		Card[] thingy = new Card[handSize];//Create card object
		
		//Make sure the hand isn't full
		while(cardsDealt < handSize)
		{
			//populate the card object
			for(int i=0; i<handSize;i++)
			{
				thingy[i] = dealACard();
				cardsDealt++;//increment cardsDealt
			}
			player.setHand(thingy);//set the player object's hand to the array of cards
		}
		//Return the object
		return player;
	}
}//end Deck class