import java.util.Scanner;
public class Prob_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		int positive = 0;
		int negative = 0; 
		int total = 0;
		double average = 0;
		System.out.print("Enter an integer, the input ends if it is 0: ");
	
		for (int counter = -1; counter != 0; ) {
			counter = input.nextInt();
			if (counter > 0) positive++;
			else if (counter < 0) negative++;
			total += counter;
		}
		average = total /(double)(positive + negative);
		System.out.println("The number of positive numbers is " + positive);
		System.out.println("The number of negative nubmers is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average of the nubmers is " + average);
		
	}

}
