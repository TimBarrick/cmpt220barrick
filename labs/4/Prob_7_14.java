import java.util.Scanner;

public class Prob_7_14 {
	
	static final int SIZE = 10;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[SIZE];
		
		System.out.print("Enter 10 Nubmers to Get the GCD: ");
		for(int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();
		
		
		
	}
	
	public static int gcd(int... numbers) {
		int gcd = 1;
		int min = getMin(numbers);
		int length = numbers.length - 1;
		
		int count = 0;
		 for (int i = 2; i <= min; i++) {

	            for (int k = 0; k <= length; k++) {
	                if (numbers[k] % i == 0) {
	                    count++;
	                    if (count == length) gcd = i;
	                } else {
	                    count = 0;
	                }
	            }
	        }

	        return gcd;
	    }

	    public static int getMin(int[] array) {
	        int min = array[0];
	        for (int i = 0; i < array.length; i++) {
	            if (min > array[i]) {
	                min = array[i];
	            }
	        }
	        return min;
	    }


	
	}

