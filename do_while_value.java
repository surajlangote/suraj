package May_15;

import java.util.Scanner;

public class do_while_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");
		n=sc.nextInt();
		do {
			System.out.println(i);
			--i;
		}
		while(i>=n);

	}

}
