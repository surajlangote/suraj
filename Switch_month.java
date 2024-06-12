package May_15;
import java.util.Scanner;
public class Switch_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month :");
		month=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("jan");
			break;
			
		case 2:
			System.out.println("feb");
			break;
			
		case 3:
			System.out.println("march");
			break;
			
		case 4:
			System.out.println("april");
			break;
			
		case 5:
			System.out.println("may");
			break;
			
		case 6:
			System.out.println("jun");
			break;
			
		case 7:
			System.out.println("july");
			break;
			
		case 8:
			System.out.println("agust");
			break;
			
		case 9:
			System.out.println("sept");
			break;
			
		case 10:
			System.out.println("oct");
			break;
			
		case 11:
			System.out.println("nov");
			break;
			
		case 12:
			System.out.println("dec");
			break;
			
		default :
			System.out.println("Inavlid month enter");
		}
		

	}

}
