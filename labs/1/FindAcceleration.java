import java.util.Scanner;
public class FindAcceleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Enter Starting Velocity, Ending Velocity, and Time
		System.out.print("Enter the End velocity, Start velocity and Time: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t  = input.nextDouble();
		
		//Determine Acceleration
			double a1 = (v1 - v0) / t;
		
		//Display Acceleration
			System.out.print("The acceleration for " + v0 + "," + v1 + "," + t + " is " + a1);
	}

}
