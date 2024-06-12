package May_15;

import java.util.Scanner;

public class ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no :");
		a=sc.nextInt();
		b=sc.nextInt();
		int answer = a>b? a: b;
		System.out.println("greater value :"+answer);

	}

}
