package May_15;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number :");
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Evene");
		} else {
			System.out.println("Odd");
		}

	}

}
