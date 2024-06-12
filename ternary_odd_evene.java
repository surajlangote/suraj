package May_15;

import java.util.Scanner;

public class ternary_odd_evene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		num=sc.nextInt();
		String evene_odd;
		evene_odd = (num%2==0)? "evene": "odd";
		System.out.println("number :"+evene_odd);
		
//*************************************************************************
		

		int age;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter age :");
		age=sc.nextInt();
		
		String answer;
		answer=age>=18 ? "voting allowed" : "not allowed :";
		System.out.println("person:"+answer);

	}

}
