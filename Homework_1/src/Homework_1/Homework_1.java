package Homework_1;
public class Homework_1 {
	
	public String name;
	public int GitHubID;
	
	//Class that holds name and ID
	public Homework_1(String name,int GitHubID){
		this.name = name;
		this.GitHubID = GitHubID;
		
	}
	//to string of Class
	public String toString() {
		String s = this.name + " has a Github ID of " + this.GitHubID +"!";
		return s;
		
	}
	public static void main(String[] args) {
		
		Homework_1 Khuram = new Homework_1("Khuram", 112579665);
		System.out.println(Khuram);
		
		Homework_1 Hipolito = new Homework_1("Hipolito", 80554014);
		System.out.println(Hipolito);
			

	}

}
