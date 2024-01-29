package Homework_1;
public class Homework_1 {
	
	public String name;
	public int GitHubID;
	
	public Homework_1(String name,int GitHubID){
		this.name = name;
		this.GitHubID = GitHubID;
		
	}
	//to string of object
	public String toString() {
		String s = this.name + "has a Github ID of " + this.GitHubID +"!";
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework_1 Khuram = new Homework_1("Khuram", 112579665);
		System.out.println(Khuram);
		

	}

}
