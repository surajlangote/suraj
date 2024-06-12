package May_15;

import java.util.Scanner;

public class Find_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit :");
		unit=sc.nextInt();
		float bill_amt,unit_amt,sg;
		if(unit<=50) {
			unit_amt=unit*0.50f;
		}
		else if(unit<=100) {
			unit_amt=unit*0.75f;
		}
		else if(unit<=150 ) {
			unit_amt=unit*1.20f;
		}
		else {
			unit_amt=unit*1.50f;
		}
		sg= unit_amt*0.2f;
		System.out.println("surcharge amount :"+sg);
		bill_amt=unit_amt+sg;
		System.out.println("unit_amt :"+unit_amt);
		System.out.println("bill_amt :"+bill_amt);
	}

}
