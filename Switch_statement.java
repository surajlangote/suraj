package May_15;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day :");
		day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
			
		default :
			System.out.println("Invalid enter day");
		}

	}

}
