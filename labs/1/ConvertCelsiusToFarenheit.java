
import java.util.Scanner;

public class ConvertCelsiusToFarenheit {

	private static Scanner input;

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		double farenheit = (9.0 / 5.0) * celsius + 32.0;
		System.out.println(celsius + " degrees is " + farenheit + " in Farenheit");	
	}

}
