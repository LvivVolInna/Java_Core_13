package hw13;

import java.util.ArrayList;
import java.util.Scanner;

public class SuprermeCouncilMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SupremeCouncil rada = new SupremeCouncil();

		rada.add(new Faction("A"));
		rada.add(new Faction("B"));
		rada.add(new Faction("C"));
		rada.add(new Faction("D"));
		
		rada.getRada().get(0).add(new Deputy(125, 180, "Ivanenko", "Ivanna", 45, false));
		rada.getRada().get(0).add(new Deputy(140, 172, "Petrenko", "Svyryd", 52, true));
		rada.getRada().get(0).add(new Deputy(86, 182, "Opanasenko", "Taras", 31, true));
		rada.getRada().get(0).add(new Deputy(94, 188, "Semeniv", "Semen", 28, true));
		rada.getRada().get(0).add(new Deputy(59, 170, "Ostapenko", "Orest", 44, true));
		rada.getRada().get(0).add(new Deputy(69, 168, "Shevchuk", "Svitlana", 49, true));
		rada.getRada().get(0).add(new Deputy(96, 187, "Omelyanenko", "Iryna", 36, true));
		rada.getRada().get(1).add(new Deputy(123, 175, "Kyrylenko", "Kyrylo", 47, false));
		rada.getRada().get(1).add(new Deputy(104, 176, "Potapenko", "Mykhaylo", 59, true));
		rada.getRada().get(1).add(new Deputy(98, 183, "Kupchenko", "Oleg", 66, true));

		rada.getRada().get(0).GiveBribeToDeputy(1000, 0);
		rada.getRada().get(0).GiveBribeToDeputy(10000, 1);
		rada.getRada().get(0).GiveBribeToDeputy(2000, 2);
		rada.getRada().get(0).GiveBribeToDeputy(1000, 0);
		rada.getRada().get(0).GiveBribeToDeputy(6000, 5);
		rada.getRada().get(1).GiveBribeToDeputy(2000, 0);
		rada.getRada().get(0).GiveBribeToDeputy(4000, 2);
		rada.getRada().get(1).GiveBribeToDeputy(8000, 2);
		rada.getRada().get(0).GiveBribeToDeputy(1000, 3);
		rada.getRada().get(0).GiveBribeToDeputy(4000, 3);
		rada.getRada().get(0).GiveBribeToDeputy(9000, 6);
		rada.getRada().get(0).GiveBribeToDeputy(1000, 1);

		while (true) {
			System.out.println();
			System.out.println(
					"press 1 to add faction" + "\npress 2 to delete faction" + "\npress 3 to show all factions "
							+ "\npress 4 to clean faction" + "\npress 5 to show all deputies in faction"
							+ "\npress 6 to add deputy to faction" + "\npress 7 to remove deputy from faction"
							+ "\npress 8 to show all brabbators" + "\npress 9 to show the biggest brabbator");
			switch (scanner.next()) {

			case "1": {
				rada.addFaction();

				break;
			}

			case "2": {
				rada.removeFaction();

				break;
			}

			case "3": {
				rada.showAllFactions();

				break;
			}

			case "4": {
				rada.removeDeputiesFromFaction();

				break;
			}

			case "5": {
				rada.showSomeFaction();

				break;
			}

			case "6": {
				rada.addDeputyToSomeFaction();

				break;
			}

			case "7": {
				rada.removeDeputyFromFaction();
				break;
			}

			case "8": {
				rada.showAllBrabbatorsFromFaction();

				break;
			}

			case "9": {
				rada.showTheBiggestBrabbatorInFaction();

				break;
			}
			}

		}

	}

}
