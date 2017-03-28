import java.util.Scanner; 
public class Prob_5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int numb = input.nextInt();
	
		
		for(int i = 2; i <= numb; ) {
			
			if( numb % i == 0) {
				System.out.print(i + " ");
				numb /= i;
			} 
			else {
				i++;
			}
		}
	}
}


