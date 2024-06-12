package May_15;

import java.util.Scanner;

public class swiping_w_variable {
	public static void main(String[]args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value :");
		a=sc.nextInt();
		b=sc.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println(a+"\n"+b);
	}

}
