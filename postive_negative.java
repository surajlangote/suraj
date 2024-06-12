package May_15;

import java.util.Scanner;

public class postive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :-");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("number  is positve");
		}
		else if(n<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("zero");
		}

	}

}
