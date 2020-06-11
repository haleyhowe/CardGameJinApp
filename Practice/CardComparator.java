package Practice;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		 int cardNumCompare = o1.getNum().compareTo(o2.getNum());
		 int cardSuiteCompare = o1.getSuite().compareTo(o2.getSuite());
		 
		 if(cardNumCompare ==0) {
			 return ((cardSuiteCompare == 0) ? cardNumCompare: cardSuiteCompare);
		 }
		 else {
			 return cardNumCompare;
		 }
		 
	}


}
