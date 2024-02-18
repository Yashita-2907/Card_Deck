import java.util.*;

public class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("____Creating Deck____");
		deck.createDeck();
		System.out.println("__Printing Deck___");
		deck.printDeck();
		System.out.println("__Shuffling Deck___");
		deck.shuffleDeck();
		System.out.println("__Printing Shuffled Deck___");
		deck.printDeck();
		System.out.println("___Printing Card___");
		deck.showCard();
		
	}
	
}