package May_15;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vlaue :");
		marks=sc.nextInt();
		if(marks>=40 && marks<=50) {
			System.out.println("Fail");
		}
		else if(marks>=50 && marks<=60) {
			System.out.println("D-grade");
		}
		else if(marks>=60 && marks<=70) {
			System.out.println("C-grade");
		}
		else if(marks>=70 && marks<=80) {
			System.out.println("B-grade");
		}
		else if(marks>=80 && marks<=90) {
			System.out.println("A-grade");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
