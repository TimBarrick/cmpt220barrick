import java.util.Scanner;

public class CalculateTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Enter a subtotal 
		System.out.print(" Enter your subtotal: ");
		double subtotal = input.nextDouble();
		//Enter a gratuity rate
		System.out.print(" Enter your gratuity rate: ");
		double gratuityRate = input.nextDouble();
		//Display gratuity 
		double gratuityTotal = subtotal * gratuityRate * .01;
		//Display total
		double total = subtotal + gratuityTotal;
		
		System.out.print("The gratuity is " + gratuityTotal + " and the total is " + total);
	}

}
