package hw13;

import java.util.Scanner;

public class FactionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Faction members = new Faction("A");

		members.add(new Deputy(125, 180, "Ivanenko", "Ivanna", 45, false));
		members.add(new Deputy(140, 172, "Petrenko", "Svyryd", 52, true));
		members.add(new Deputy(86, 182, "Opanasenko", "Taras", 31, true));
		members.add(new Deputy(94, 188, "Semeniv", "Semen", 28, true));
		members.add(new Deputy(59, 170, "Ostapenko", "Orest", 44, true));
		members.add(new Deputy(69, 168, "Shevchuk", "Svitlana", 49, true));
		members.add(new Deputy(96, 187, "Omelyanenko", "Iryna", 36, true));
		members.add(new Deputy(123, 175, "Kyrylenko", "Kyrylo", 47, false));
		members.add(new Deputy(104, 176, "Potapenko", "Mykhaylo", 59, true));
		members.add(new Deputy(98, 183, "Kupchenko", "Oleg", 66, true));

		members.GiveBribeToDeputy(1000, 0);
		members.GiveBribeToDeputy(10000, 1);
		members.GiveBribeToDeputy(2000, 2);
		members.GiveBribeToDeputy(1000, 0);
		members.GiveBribeToDeputy(6000, 5);
		members.GiveBribeToDeputy(2000, 7);
		members.GiveBribeToDeputy(4000, 2);
		members.GiveBribeToDeputy(8000, 9);
		members.GiveBribeToDeputy(1000, 3);
		members.GiveBribeToDeputy(4000, 3);
		members.GiveBribeToDeputy(9000, 6);
		members.GiveBribeToDeputy(1000, 1);

		// members.showAllDeputiesOfTheFaction();

		while (true) {
			System.out.println("press 1 to add deputy" + "\npress 2 to delete deputy"
					+ "\npress 3 to show all brabbators " + "\npress 4 to show the biggest brabbator"
					+ "\npress 5 to show all deputies in faction" + "\npress 6 to delete all deputies from faction");
			switch (scanner.next()) {

			case "1": {
				members.addNewDeputy();

				break;
			}

			case "2": {
				members.removeDeputy();

				break;
			}

			case "3": {
				members.showBrabbatorsList();

				break;
			}

			case "4": {
				members.showTheBiggestBrabbator();

				break;
			}

			case "5": {
				members.showAllDeputiesOfTheFaction();

				break;
			}

			case "6": {
				members.removeAllDeputiesOfTheFaction();

				break;
			}
			}

		}
	}

}
