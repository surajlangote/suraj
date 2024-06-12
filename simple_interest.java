package May_15;

import java.util.Scanner;

public class simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		int rate;
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value :");
		amount=sc.nextInt();
		rate=sc.nextInt();
		time=sc.nextInt();
		int simpleinterest=amount*rate*time/100;
		System.out.println("simpleinterest :"+simpleinterest);

	}

}
