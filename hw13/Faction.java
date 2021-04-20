package hw13;

import java.util.ArrayList;
import java.util.Scanner;

public class Faction {
	
	
	private String factionName;
	
	private ArrayList<Deputy> members = new ArrayList<Deputy>();
	
	public Faction(String factionName) {
		this.factionName = factionName;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public ArrayList<Deputy> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Deputy> members) {
		this.members = members;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((factionName == null) ? 0 : factionName.hashCode());
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faction other = (Faction) obj;
		if (factionName == null) {
			if (other.factionName != null)
				return false;
		} else if (!factionName.equals(other.factionName))
			return false;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", members=" + members + "]";
	}
	
	public void GiveBribeToDeputy(int size, int id) {
		this.members.get(id).getBribe(size);
	}
	
	public void add (Deputy deputy) {
		members.add(deputy);
		
	}	
	
//	додати депутата(вводимо з консолі)
	public void addNewDeputy() {
		System.out.println("Enter the surname of the new deputy");
		Scanner sc = new Scanner(System.in);
		String surname = sc.nextLine();
		
		System.out.println("Enter the name of the new deputy");
		String name = sc.nextLine();
		
		System.out.println("Enter age of the new deputy");
		int age = sc.nextInt();
		
		System.out.println("Enter true if deputy takes bribes/ false if deputy doesn't take bribes");
		boolean bribe = sc.nextBoolean();
		
		
		Deputy dep = new Deputy(1.0, 1.0, surname, name, age, bribe);
		members.add(dep);
		System.out.println("This deputy " + dep + " have been added");
	}
	
//	видалити депутата(вводимо з консолі)
	public void removeDeputy() {

		System.out.println("Enter the name of the deputy");
		Scanner sc = new Scanner(System.in);
		String dep = sc.nextLine();

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equalsIgnoreCase(dep)) {
				System.out.println("Deputy " + members.get(i).getName() + " have been deleted from the faction");
				members.remove(i);
				break;
			}
			
		}
		
	}

//	вивести всіх хабарників у фракції
	public void showBrabbatorsList (){
		for (Deputy deputy : members) {
			if(deputy.isBribe()) {
				System.out.println(deputy);
			}
		}
	}
		
//	вивести найбільшого хабарника у фракції
	public void showTheBiggestBrabbator(){
		
		members.sort(new DeputiesBribeSizeComparator());
		System.out.println("The biggest brabbator is: " + members.get(members.size()-1).getSurname() + " "  + members.get(members.size()-1).getName());
	}

//	вивести всіх депутатів фракції
	public void showAllDeputiesOfTheFaction(){
		for (Deputy member: members) {
			System.out.println(member);
		}
	}
	
//	очистити всю фракцію від депутатів
	public void removeAllDeputiesOfTheFaction(){

		for (int i = members.size() - 1; i >= 0; i--) {
			members.remove(i);
		}
		System.out.println("There are no deputies in the faction: " + members);
	}

}
