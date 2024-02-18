import java.util.*;

class Deck{
	ArrayList<Cards> cards = new ArrayList<Cards>();
	
	public void createDeck(){
		
		String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suits = {"Clubs","Hearts","Spades","Diamonds"};
		
		for (String suit: suits){
			for(String rank: ranks){
				cards.add(new Cards(rank,suit));
			}
		}
	}
	public void shuffleDeck(){
		Collections.shuffle(cards);
	
	}//End of Shuffle
	
	public void printDeck(){
		for(Cards card: cards){
			System.out.println(card);
		}
	}
	public void showCard(){
		System.out.println(cards.get(0));
	}
}