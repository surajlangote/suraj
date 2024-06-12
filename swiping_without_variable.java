package May_15;

import java.util.Scanner;

public class swiping_without_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value :");
		a=sc.nextInt();
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"\n"+"\n"+b);

	}

}
