
public class Prob_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0)
				System.out.println(getPentagonalNumber(i) + " ");
			else
				System.out.print(getPentagonalNumber(i) + " ");
		}

	}
	public static int getPentagonalNumber(int n) {
		int num = n * (3 * n - 1) / 2;
		return num;
	}
}
