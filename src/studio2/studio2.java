package studio2;

import java.util.Scanner;

public class studio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println ("What is the start amount?");
		double startAmount = in.nextDouble();
		System.out.println ("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.println ("What is the win limit?");
		double winLimit = in.nextDouble();
		System.out.println ("How many simulations?");
		int totalSimulations = in.nextInt();
		double remainingAmount = startAmount;
		int numberplays = 0;
		boolean win = false ;
		int losses = 0;
		for(int j = totalSimulations; j > 0; j--) {
		
			
			for (double i=remainingAmount; i < winLimit && i > 0; i++) {
				numberplays ++;
				
				double play = Math.random();
				if (play>winChance) {
					win = true;
					remainingAmount = remainingAmount +1;
				}
				else {
					win = false;
					losses++;
					remainingAmount = remainingAmount-1;
				}
			}
			System.out.println ("Simulation: "+j  +"\n \tNumber plays: "+numberplays+" \n\t " +win);

}
		double ruinrate = (double) losses/numberplays;

			double alpha = ((1-winChance)/winChance);
			double expectedruin = (Math.pow(alpha,startAmount)- Math.pow(alpha,winLimit)/(1-Math.pow(alpha,winLimit)));
		
			System.out.println ("Total Simulations: "+totalSimulations  + " Losses: " +losses +" Ruin Rate: "+ruinrate+ " Expected ruin rate: " +expectedruin);
		
		
		}
	

}
