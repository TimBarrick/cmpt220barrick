import java.util.Scanner; 
public class Prob_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		
		int num = input.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println(num + " is Palindrome");
		} 
		else { System.out.println(num + " is not Palindrome");
			
		}
	}
	
	public static boolean isPalindrome(int number) {
		
		int num = number;
		
		int reverse = 0;
		
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
	if (number == reverse) {
		
		return true;
		
		}
	else {
		return false;
	}
	}

}
