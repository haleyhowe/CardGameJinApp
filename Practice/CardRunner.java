package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CardRunner {

	public static void main(String[] args) {
		int decision2;
		Scanner userInput = new Scanner(System.in);
		Map<Integer, Integer> map1  = new HashMap();
		Map<Integer, Integer> map2  = new HashMap();
		///checkCard checkC = new checkCard();
		List <String> list = Arrays.asList("Two", "Three", "Four",
				"Five", "Six","Seven","Eight","Nine","Ten", "Jack","Queen", "King", "Ace");
		List <String> suit = Arrays.asList("Spades", "Diamonds", "Hearts", "Clovers");
		
		int count = 0;
		Random rand = new Random();
		
		///PICKING FIRST TWO CARDS
		int pickNum= rand.nextInt(13);
		count = count + (map2.get(pickNum));
		int pickSuit= rand.nextInt(4);

		
		System.out.println("Your first card is: " + list.get(pickNum) + " of " 
		                           + suit.get(pickSuit) +".");
		
		int pickNum2= rand.nextInt(13);
		int pickSuit2= rand.nextInt(4);
		System.out.println("Count >>>>>>" +  count);
		System.out.println();
		count = count + map2.get(pickNum2);

		System.out.println("Your second card is: " + list.get(pickNum2) + " of " 
                + suit.get(pickSuit2) +".");
		System.out.println("Count >>>>>>" +  count);
		System.out.println();
		
		System.out.println("Press 1 to Hit or 0 to Stay.");
		int decision = userInput.nextInt();
		
		//if user hits
		
		if(decision == 1) {
			
			int pickNum3= rand.nextInt(13);
			int pickSuit3= rand.nextInt(4);
			
			count = count + map2.get(pickNum3);
			
			System.out.println("Your third card is: " + list.get(pickNum3) + " of " 
	                + suit.get(pickSuit3) +".");
			System.out.println("Count >>>>>>" +  count);
			
			if(count> 21) {
				System.out.println("Bust...");
			}
			
			
			}
		System.out.println("Press 1 to Hit or 0 to Stay.");
		decision2 = userInput.nextInt();
		
			if(decision2 == 1) {
				int pickNum4= rand.nextInt(13);
				int pickSuit4= rand.nextInt(4);
				
				count = count + map2.get(pickNum4);
				
				System.out.println("Your fourth card is: " + list.get(pickNum4) + " of " 
		                + suit.get(pickSuit4) +".");
				System.out.println("Count >>>>>>" +  count);
				if(count>21) {
					System.out.println("Bust...");
				}
				
			}

		else {
			System.out.println("Dealers turn....");
		}

		//System.out.println(map1);
		
		//System.out.println(map1.get(2));
		int check = map1.get(pickNum);
		int check2 = map1.get(pickNum2);
		check = check - 1;
		map1.replace(pickNum, check);
		
		check2 = check2 - 1;
		map1.replace(pickNum2, check2);
		System.out.println(map1);
		
		
		
		
		
		

		
			}

	}


