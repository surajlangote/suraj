package May_15;

import java.util.Scanner;

public class arithmatic_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		int a,b;
		int answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers for operation :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter choice :");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		case '+':
			answer=a+b;
			System.out.println("addtion is :"+answer);
			break;
			
		case '-':
			answer=a-b;
			System.out.println("substraction is :"+answer);
			break;
			
		case '*':
			answer=a*b;
			System.out.println("multiplication is :"+answer);
			break;
			
		case '/':
			answer=a/b;
			System.out.println("division is :"+answer);
			break;
			
		case '%':
			answer=a%b;
			System.out.println("modulo is :"+answer);
			break;
			
		default :
			System.out.println("invalid input");
		}
		

	}

}
