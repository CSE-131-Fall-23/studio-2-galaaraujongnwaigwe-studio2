package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		
		int currentSimulation = 0;
		int totalSimulations = 500;
		int losses = 0;
		
		double currentBalance = startAmount;
		int roundsPlayed = 0;
		
		while (currentSimulation < totalSimulations) {
			while (currentBalance > 0 && currentBalance < winLimit) {
				double randomNumber = Math.random();
				
				if (randomNumber <= winChance) {
					currentBalance++;
				} else {
					currentBalance--;
				}
				
				roundsPlayed++;
			}
			
			System.out.print("Simulation " + currentSimulation + ": " + roundsPlayed);
			if (currentBalance > 0) {
				System.out.print(" WIN");
			} else {
				System.out.print(" LOSE");
				losses++;
			}
			System.out.println("");
			
			roundsPlayed = 0;
			currentBalance = startAmount;
			currentSimulation++;
		}
		
		System.out.println("Losses: " + losses + " Simulations " + totalSimulations);
	}

}
