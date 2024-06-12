package May_15;

import java.util.Scanner;

public class tarnary_votingornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		age=sc.nextInt();
		String answer=age>=18? "voting allowed": "Not allowed";
		System.out.println(answer);

	}

}
