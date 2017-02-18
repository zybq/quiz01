package quiz1;

import java.util.Scanner;

public class main {
	public static void QBrating() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many touchdowns?");
		double touchdowns = input.nextDouble();
		
		System.out.println("How many total yards?");
		double totalYards = input.nextDouble();
		
		System.out.println("How many interceptions?");
		double interceptions = input.nextDouble();
		
		System.out.println("How many completions");
		double completions = input.nextDouble();
		
		System.out.println("What is the total number of passes attempted?");
		double passesAttempted = input.nextDouble();
		
		//arbitrary values for formula
		double a = (completions/passesAttempted-0.3)*5;
		double b = (totalYards/passesAttempted-0.3)*0.25;
		double c = (touchdowns/passesAttempted)*20;
		double d = 2.375-(interceptions/passesAttempted)*25;
		double passerRating = 100*(a+b+c+d)/6;
		System.out.println(passerRating);
		input.close();
	}
	
	public static void main(String [] args) {
		QBrating();
	}
}
