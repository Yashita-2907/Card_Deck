public class Cards{
	private String suit;
	private String rank;
	
	public Cards(String suit,String rank){
		this.suit=suit;
		this.rank=rank;
	}
	
//Setter and Getter Methods

public String getsuit(){
	return suit;
}

public void setsuit(String suit){
	this.suit=suit;
}
public String getrank(){
	return rank;
}

public void setrank(String rank){
	this.rank=rank;
}

public String toString(){
	return "\n" + rank + " of " + suit;
	
}


}