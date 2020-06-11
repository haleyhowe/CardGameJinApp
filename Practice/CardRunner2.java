package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CardRunner2 {

	public static void main(String[] args) {
		
		Card h = new Card();
		List<Card> cards = h.createDeck();
		//System.out.println(cards);
		Queue<Player> usedCards = new LinkedList<>();
		
		List <Card> player1 = new ArrayList<Card>();
		Random rand = new Random();
		
		// Shuffling my cards
		Collections.shuffle(cards);
		for (int i = 0; i <=9; i++) {
			player1.add(cards.get(i));
		}
		
		Collections.sort(player1, new CardComparator()); 
		
		System.out.println("Player 1's Cards");
		System.out.println(player1.toString());
		//System.out.println(set.toString());
		
		
		
		
		//System.out.println(cards);
	}

}
