package May_15;

import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=10;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");
		n=sc.nextInt();
		do {
			System.out.println(i); //exit control statement
			i--;
		}
		while(i>=n);

	}

}
