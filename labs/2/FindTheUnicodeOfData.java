import java.util.Scanner;
public class FindTheUnicodeOfData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		input.close();
		
		
		System.out.println("The unicode for this character " + character + " is " + (int) character);
		
	}

}
