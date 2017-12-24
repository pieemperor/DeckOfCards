/**
 * ---------------------------------------------------------------------------
 * File name: DeckDriver.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dakota Cowell, cowelld@goldmail.etsu.edu
 * Course:  CSCI 1260-002
 * Creation Date: Mar 1, 2016
 * ---------------------------------------------------------------------------
 */

package cards;

import java.util.Scanner;
/**
 * to show functionality of the Deck Class
 *
 * <hr>
 * Date created: Mar 1, 2016
 * <hr>
 * @author Dakota Cowell
 */
public class DeckDriver
{

	/**
	 * to show functionality of the Deck Class.
	 * Will create new decks and display them.       
	 *
	 * <hr>
	 * Date created: Mar 1, 2016
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String[] args)
	{
		int handSize = 0;//variable to store size of hand - input by user
		int numHands = 0;//variable to store number of players - input by user

		//Create Scanner object
		Scanner kb = new Scanner(System.in);
		
		//Create new deck
		Deck deck1 = new Deck();

			//Prompt user for number of cards per hand
			System.out.println("How many cards are in one hand? ");
			handSize = kb.nextInt();//store input in handSize variable
			
			//Prompt for number of players
			System.out.println("How many players are playing?");
			numHands = kb.nextInt ( );//store input in numHands

		
			//Make sure they didn't ask for too many cards
		while(handSize*numHands > 52)
		{
			//Display Error 
			System.out.println("There are not enough cards in the deck to deal " +
			numHands +  " hands of " + handSize + " cards. Try again. \n");
			//Prompt user for number of cards per hand
			System.out.println("How many cards are in one hand? ");
			handSize = kb.nextInt();//store input in handSize variable
			
			//Prompt for number of players
			System.out.println("How many players are playing?");
			numHands = kb.nextInt ( );//store input in numHands
		}
		

		//Shuffle the deck twice
		deck1.shuffle ( );
		deck1.shuffle ( );

		//Create Hand array
		Hand[] allPlayers = new Hand[numHands];
		
		
		//fill the Hand array with cards and display it
		for(int i = 0; i< allPlayers.length;i++)
		{
			allPlayers[i] = deck1.dealAHand(handSize);
			System.out.println("Player " + (i+1)+ ": \n" + allPlayers[i].toString()); 
		}		
		kb.close ( ); //Close Scanner
	}//end main

	
}
