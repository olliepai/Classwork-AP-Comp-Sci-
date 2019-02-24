package classDesignStoringAssignmentResults;

public class AssignmentResults {
	private String name;
	private int possScore;
	
	private int numbScores;
	private StudentScore[] studScores;
	
	public AssignmentResults(String n, int poss) {
		name = n;
		possScore = poss;
		
		numbScores = 0;
		studScores = new StudentScore[100];
	}
	
	public String getName() {
		return name;
	}
	
	public int getPossiblePoints() {
		return possScore;
	}
	
	public int getNumberOfScores() {
		return numbScores;
	}
	
	public StudentScore[] getTestResults() {
		return studScores;
	}
	
	public void addScore(String n, int s) {
		StudentScore blah = new StudentScore(n, s);
		studScores[numbScores] = blah;
		numbScores++;
	}
	
	public String toString() {
		String s = name + " has " + possScore + "possible points";
		
		for (int pos = 0; pos < numbScores; pos++) {
			s += studScores[pos].getName() + " : " + studScores[pos].getScore() + "\n";
		}
		
		return s;
	}
	
}
