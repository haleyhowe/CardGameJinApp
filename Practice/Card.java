package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Card implements CardInterface {
	
	
	private int suite;
	private int num;
	List <String> cardNums = Arrays.asList("",  "Ace","Two", "Three", "Four",
			"Five", "Six","Seven","Eight","Nine","Ten", "Jack","Queen", "King");
	List <String> suits = Arrays.asList("","Spades", "Diamonds", "Hearts", "Clovers");
	
	
	Card(){
		
	}

	Card(int num, int suite){
		this.num = num;
		this.suite = suite;
	}
	
	
	
	public Integer getSuite() {
		return suite;
	}





	public Integer getNum() {
		return num;
	}




	public List<Card> createDeck(){
		List<Card> deck = new ArrayList<Card>();
		int s = 1;
		int count = 1;
	
		for(int cardNum = 1; cardNum <= 13; cardNum++) {
			for(int suiteNum = 1; suiteNum < 5; suiteNum++) {
					deck.add(new Card(cardNum,suiteNum));
			}
		}
			
		
		return deck;
	}
	
	
	
	@Override
	public String toString() {
		
		return "\n\n---- \n" + cardNums.get(num) + " of " + suits.get(suite);
	}

	
	 
	}

