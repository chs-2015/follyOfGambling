/**
 * Name: Brandon B.
 * Date: 9-15-15
 * Description: Gambling simulator 2015
 */

import java.util.Scanner;
import java.util.Random;
public class follyOfGambling {

    public static void main(String[] args) {
    	Scanner kbReader = new Scanner(System.in);
    	Random numberGenerator = new Random();

		int die1, die2, dieSum, // our incredible dice
		playerMoney, bestEarning, // wie viel geld hat jemand?
		totalCount = 0, bestCount = 0; // the count when someone is bankrupt, and when they made the most money
		final int winningNumber = 7;

		// Request cash from user
		System.out.print("Wie viel Geld haben Sie? ");
		playerMoney = kbReader.nextInt();

		bestEarning = playerMoney; // Currently this is their best earning.

		// Loop until we're broke af
		while (playerMoney > 0) {
			totalCount++;
			die1 = numberGenerator.nextInt(6) + 1; // This is so gross omg
			die2 = numberGenerator.nextInt(6) + 1; // Python where are you :(
			dieSum = die1 + die2;

			if (dieSum == winningNumber) {
				playerMoney += 4;
			}
			else {
				playerMoney -= 1;
			}

			if (playerMoney > bestEarning) {
				// The player has a new record!
				bestEarning = playerMoney;
				bestCount = totalCount;
			}
		}
		System.out.println("You went broke after: " + totalCount + " rolls.");
		System.out.println("You were best off at roll " + bestCount + " when you had $" + bestEarning + ".");
    }
}
