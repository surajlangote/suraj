package May_15;

import java.util.Scanner;

public class prime_not {
	
// write a program to find given prime or not?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		n=sc.nextInt();
		int i=2;
		int temp=0;
		while(i<=n-1) {
			if(n%i==0) {
				temp=temp+1;
			}
			i++;
		}
		if(temp==0) {
			System.out.println("is prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}

}
