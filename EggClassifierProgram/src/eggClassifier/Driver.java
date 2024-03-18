/*
 @author: Amirreza Mirzaei 
 @Date: November 27
 * - create a method inputPositiveDouble(String prompt) that ensures that only 
 *   positive numbers are entered, use this in the main method logic.
 */



//ToDo:  Supervisor wants programmer comments here (use /* */ comment)

//ToDo:  Supervisor wants programmer comments here (use /* */ comment)
package eggClassifier;

public class Driver {

	//ToDo:  Supervisor wants programmer comments here (use /* */ comment)
	public static void main(String[] args) {
		CanadaAEgg egg = new CanadaAEgg();
		// (declare and initialize other variables as needed here)
		double weight;
		int eggCount = 0;
		int jumboCount = 0;
		int extraLargeCount = 0;
		int largeCount = 0;
		int mediumCount = 0;
		int smallCount = 0;
		int peeweeCount = 0;
		String condition;
	
	
		do {
			// Prompt the user to enter the weight of the egg
			// Enter measured weight:
			weight = User.inputPositiveDouble("Enter measured weight: ");
			eggCount++;

			// Set the weight into an instance of CanadaAEgg
			CanadaAEgg canadaAEgg = new CanadaAEgg(weight);

			// Use the toString method of class CanadaAEgg
			String string= canadaAEgg.toString();
            System.out.println(string);
			// to output the information for the egg
			canadaAEgg.toString();

			// Use the CanadaAEggClassifier method to obtain a classification of an egg
			// instance
			// by passing the CanadaAEgg reference-value as an argument.
			char classify = CanadaAEggClassifier.classifyCanadaAEgg(canadaAEgg);

			// Output a message to tell the user the classification of the egg instance
			// for example
			// Egg is of Jumbo Size.
			switch (classify) {
			case 'J':
				System.out.println("Egg is of Jumbo Size");
				jumboCount++;
				break;
			case 'E':
				System.out.println("Egg is of Extra Large Size");
				extraLargeCount++;
				break;
			case 'L':
				System.out.println("Egg is of Large Size");
				largeCount++;
				break;
			case 'M':
				System.out.println("Egg is of Medium Size");
				mediumCount++;
				break;
			case 'S':
				System.out.println("Egg is of Small Size");
				smallCount++;
				break;
			case 'P':
				System.out.println("Egg is of PeeWee Size");
				peeweeCount++;
				break;
			}

			// Collect a count of, and display to the user:
			// the number of egg weights entered
			// the number of egg weight measurements that fall under each of the size
			// designations
			// for example
			// Eggs entered: 10
			// Jumbo Size: 2
			// Extra Large Size: 1
			// Large Size: 3
			// Medium Size: 1
			// Small Size: 1
			// Peewee Size: 2
			System.out.println("Eggs entered: " + eggCount);
			System.out.println("Jumbo Size: " + jumboCount);
			System.out.println("Extra Large Size: " + extraLargeCount);
			System.out.println("Large Size: " + largeCount);
			System.out.println("Medium Size: " + mediumCount);
			System.out.println("Small Size: " + smallCount);
			System.out.println("PeeWee Size: " + peeweeCount);

			// Print out your name, student ID number, and lab section number on the screen
			System.out.println("Program by Amirreza Mirzaei, 041118069, Lab Section 362");

			// Using a loop ask if there is more data to enter (yes, no) and continue
			// only if the user enters some form of yes
			// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
			// if yes, processing should repeat starting with the output of the
			// user-instructions

			condition = User.inputString("Continue (yes/no)?");
			// You can use any decision structure or loop for this program,
			// however a for-loop is not recommended for the main method logic
		} while (condition.equalsIgnoreCase("yes"));

	}
}

