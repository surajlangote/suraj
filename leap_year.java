package May_15;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		n=sc.nextInt();
		if(n%4==0 || n%400==0 && n%100!=0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not");
		}
	}

}
