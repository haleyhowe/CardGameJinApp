package Practice;
import java.util.*;

public class MakeTeams {
		
	MakeTeams(){
		
	}
	int count = 1;
	
	public void create_teams (Map a){
		int max = a.size();
		
		Random rand = new Random();
		
		while(a.size()!= 0) {
			//System.out.println("This is the top of the loop");
			System.out.println();
			System.out.println("This is your Map: " + a.toString());
			System.out.println();
			//System.out.println("a.size(): " + a.size());
			System.out.println("Partner Creation >>>>>>>>");
			System.out.println();
			while(count <=2) {
				int pick = rand.nextInt(max - 1 + 1)+1;
				if(a.containsKey(pick)) {
					System.out.println("The random generator picked: " + a.get(pick));
					//System.out.println("This is the count: " + count);
					a.remove(pick);
					count+=1;

			}
				else {
					continue;
				}
		}
			//System.out.println("Count reset.......");
			count = 1;
			
		}
		

	}
	
		
	public List <Integer> sizeList(int size) {

		List <Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= size; i++) {
			list.add(i);
		}
		return list;
	}
			
						
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

