package Practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.cognixia.jump.fullstack.codeChallenges.Partner;

public class PracticeMain {

	public static void main(String[] args) {
			Player haley = new Player("Haley", 10);
			Player wendy = new Player("Wendy", 9);
			Player ali = new Player("Ali",8);
			Player jordan = new Player("Jordan", 7);
			Player julia = new Player("Julia", 6);
			Player nora = new Player("Nora", 5);
			Player abby = new Player("Abby", 4);
			Player sam = new Player("Sam", 3);
			Player sonja = new Player("Sonja", 2);
			Player kiara = new Player("Kiara", 1);
			
			Queue<Player> linklist = new LinkedList<>();
			linklist.add(wendy);
			linklist.add(haley);
			linklist.add(kiara);
			
			
		
			List <Player> array = new ArrayList<Player>();
			
			array.add(wendy);
			array.add(haley);
			array.add(kiara);
			
			
			Set <Player> set = new HashSet<Player>();
			
			set.add(wendy);
			set.add(haley);
			set.add(kiara);
			set.add(haley);
			
			
			Deque <Player> deq = new ArrayDeque<Player>();
			deq.add(wendy);
			deq.add(haley);
			deq.add(kiara);
			
			Map<Integer,String> hashmap  = new HashMap<Integer,String>();
			
			int wenR =  wendy.getRank();
			String wenN = wendy.getName();
			hashmap.put(wenR, wenN);
			
			String hayN = haley.getName();
			int hayR =  haley.getRank();
			
			hashmap.put(hayR,hayN);
		
		
			
			
			//Queue - FIFO - create teams by FIFO- store them in HashSet
			System.out.println("This is the original link list.");
			System.out.println(linklist.toString());
			System.out.println();
			linklist.remove();
			System.out.println("Remove() function executed...");
			System.out.println();
			System.out.println(linklist.toString());
			
			//ArrayList - can make teams by random number generator
			System.out.println();
			System.out.println("Original ArrayList");
			System.out.println(array.toString());
			///Arrays remove by index
			System.out.println();
			array.remove(2);
			System.out.println("Remove by index");
			System.out.println("Array list length: " + array.size());
			System.out.println(array.toString());
			
			//Set - only stores unique values
			///Can use sets to see if player is in db
			System.out.println();
			System.out.println("This is the original Set");
			System.out.println(set.toString());
			
			///Deque - FIFO
			System.out.println();
			System.out.println("This is the deque.");
			System.out.println(deq.toString());
			System.out.println();
			System.out.println("Removing from deque");
			deq.remove();
			System.out.println(deq.toString());
			
			//HashMap- unique values only
			System.out.println();
			System.out.println(hashmap.toString());
			
			

			
			
		
			
			
	}

}
