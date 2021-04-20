package hw13;

import java.util.ArrayList;
import java.util.Scanner;

public class SupremeCouncil {
	ArrayList<Faction> rada = new ArrayList<Faction>();

	public SupremeCouncil() {
	}

	public ArrayList<Faction> getRada() {
		return rada;
	}

	public void add(Faction faction) {
		rada.add(faction);
	}

//	додати фракцію
	public void addFaction() {
		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		Faction f = new Faction(name);
		rada.add(f);
		System.out.println("Faction " + f.getFactionName() + " have been added");
	}

//	видалити фракцію
	public void removeFaction() {

		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getFactionName().equalsIgnoreCase(name)) {
				System.out.println("Faction " + rada.get(i).getFactionName() + " have been deleted");
				rada.remove(i);
				break;
			}

		}

	}

//	вивести всі фракції
	public void showAllFactions() {
		for (Faction faction : rada) {
			System.out.println(faction);
		}
	}

//  очистити конкретну фракцію
	public void removeDeputiesFromFaction() {
		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getFactionName().equalsIgnoreCase(name)) {
				rada.get(i).removeAllDeputiesOfTheFaction();
				//System.out.println("Fraction " + rada.get(i).getFactionName() + " is empty");
				break;
			}
		}
	}

//	вивести депутатів конкретної фракції
	public void showSomeFaction() {
		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getFactionName().equalsIgnoreCase(name)) {
				rada.get(i).showAllDeputiesOfTheFaction();
				break;
			}
		}
	}

//	додати депутата до конкретної фракції
	public void addDeputyToSomeFaction() {
		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getFactionName().equalsIgnoreCase(name)) {
				rada.get(i).addNewDeputy();
				break;
			}
		}
	}
//	видалити депутата(вводимо з консолі)
	public void removeDeputyFromFaction() {
		System.out.println("Enter the name of the deputy");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (Faction f : rada) {
			for (int i = 0; i < f.getMembers().size(); i++) {
				if (name.equalsIgnoreCase(f.getMembers().get(i).getName())) {
					System.out.println("Deputy " + f.getMembers().get(i).getName() + " have been removed");
					f.getMembers().remove(i);
					break;
				}
			}
		}
	}

//	вивести всіх хабарників у фракції
	public void showAllBrabbatorsFromFaction() {
		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getFactionName().equalsIgnoreCase(name)) {
				rada.get(i).showBrabbatorsList();
				break;
			}
		}
	}

//	вивести найбільшого хабарника у фракції
	public void showTheBiggestBrabbatorInFaction() {
		System.out.println("Enter the name of the faction");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).getFactionName().equalsIgnoreCase(name)) {
				rada.get(i).showTheBiggestBrabbator();
				break;
			}
		}
	}

}
