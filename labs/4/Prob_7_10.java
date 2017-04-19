import java.util.Scanner; 

public class Prob_7_10 {

	static final int SIZE = 10;
	
	public static void main(String[] args) {
		
		double[] numbers = new double[SIZE];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter " + SIZE + "amount of numbers: ");
		for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();
		
		System.out.println("The Index of the Smallest Number is: " + indexOfSmallestElement(numbers));
		
		
	}
	
	public static int indexOfSmallestElement(double[] array) {
		
			int index = 0;
			double low = array[index];
			for(int i = 0; i < array.length; i++) {
				
				if(low > array[i]) {
					low = array[i];
					index = 1;
				}
			}
		return index;	
	}
}
