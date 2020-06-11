package Practice;

public class Player {
	String name;
	int rank;
	
	Player(String name, int rank){
		this.name = name;
		this.rank = rank; 
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		
		return ("\nPlayers name: " + name + ". Ranking: " + rank);
	}
	
	
}
