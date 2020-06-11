package Practice;

import java.util.*;

public class TeamsMain {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		

		String input;
		
		Deque <String> teamNames = new ArrayDeque<String>();
		Set <String> set = new HashSet<String>();

		do {
			System.out.println();
			System.out.println("Please enter a player name: ");
			System.out.println("Press 'q' to quit");
			input = userInput.next();	
			if(input.equals("q")!= true) {
				if(set.contains(input)) {
					System.out.println("You have already entered this player."
							+ "\n Please try again...");
					continue;
				}
				else {
					teamNames.add(input);
					set.add(input);
				}	
			}
		}
		while(input.equals("q")!= true );
		
		
		userInput.close();
		
//		teamNames.add("Haley");
//		teamNames.add("Colette");
//		teamNames.add("Jamie");
//		teamNames.add("Kevin");
//		teamNames.add("Brooks");
//		teamNames.add("Calvin");
//		teamNames.add("Carelton");
//		teamNames.add("Charles");
//		teamNames.add("David");
//		teamNames.add("Gordon");
//		teamNames.add("Matt");
//		teamNames.add("Colt");
//		
		System.out.println();
		System.out.println("These are your players: ");
		System.out.println(teamNames.toString());
		
		MakeTeams a = new MakeTeams();
		
		Queue<Integer> list1 = new LinkedList<>(a.sizeList(teamNames.size()));
		
		//System.out.println(list1.toString());
		

		Map<Integer, String> hashmap  = new HashMap<Integer, String>();
		

		//System.out.println("This is your for loop: ");
		System.out.println();
		System.out.println("Generating Partners......");
		//System.out.println(list1.size());
		int listSize = list1.size()-1;
		for(int i = 0; i <= listSize; i++) {
			//System.out.println(list1.size());
			//System.out.println("I --------> " + i);
			hashmap.put(list1.poll(), teamNames.pop());
			//System.out.println(list1.toString());
			//System.out.println(teamNames.toString());
			//System.out.println(hashmap.toString());
		}
		
		//System.out.println(hashmap.toString());
	
	
		a.create_teams(hashmap);
		
//		
//		System.out.println(list.toString());
//		
//		
		
	}

}
