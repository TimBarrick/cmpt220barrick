import java.util.Scanner; 
public class FindFutureDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Find Today's Date
		System.out.print("Put Integer for Today's Date");
		int currentDate = input.nextInt();
		
		//Find Days Elapsed 
		System.out.print("Put Integer for how many days have passed");
		int elapsedDate = input.nextInt();
		
		
		
		//Find Future Date 
		int futureDate = (currentDate + elapsedDate);
		
		
		
		System.out.print("Enter an Integer from 0 to 6");
			int weekday = input.nextInt();
			
			
			
			switch (weekday % 7){
			case 0: System.out.println("Sunday");break;
			case 1: System.out.println("Monday");break;
			case 2: System.out.println("Tuesday");break;
			case 3: System.out.println("Wednesday");break;
			case 4: System.out.println("Thursday");break;
			case 5: System.out.println("Friday");break;
			case 6: System.out.println("Saturday");
			}
		

	}

}
