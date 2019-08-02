package CartGame;

public class Card {
	private String face;
	private String suit;
	private int index;
	public Card(String face,String suit,int index){
		this.face=face;
		this.suit=suit;
		this.index=index;
	}
	
	public String getFace(){
		return this.face;
	}
	public String getSuit(){
		return this.suit;
	}
	public int getIndex(){
		return this.index;
	}
	@Override
	public String toString(){
		return this.suit+this.face;
	}
}
