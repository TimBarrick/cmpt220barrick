
public class Prob_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.printf("%-12s%8s", "Kilograms", "Pounds");
	        System.out.printf("\t\t|\t\t");
	        System.out.printf("%-12s%-8s\n", "Pounds", "Kilograms");


	        for (int i = 1, j = 20; i < 200; i++, j += 5) {
	            System.out.printf("%-12d%8.1f", i, i * 2.2);
	            System.out.printf("\t\t|\t\t");
	            System.out.printf("%-12d%-8.2f\n", j, j / 2.2);

		}
	}
}


