import java.util.Scanner;

public class NumFrom1to1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Enter an Integer
		System.out.print(" Enter an Integer between 1 and 1000:  " );
		int number = input.nextInt();
		//First Digit
		int firstDigit = number % 10;
		int remainder = number / 10;
		//Second Digit 
		int secondDigit = remainder % 10;
		 remainder = remainder / 10;
		//Third Digit
		int thirdDigit = remainder % 10;
		//Sum
		int sum = firstDigit + secondDigit + thirdDigit;
		//Display Answer
		System.out.print("The sum of " + number + " is " + sum);	
	}

}
