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
<<<<<<< HEAD
			
=======
		
		
		Homework_1 Alon = new Homework_1("Alon", 112579684);
		System.out.println(Alon);
>>>>>>> 78d978a7dbe5f4c43d309f2df0511bed85798fb2

	}

}
