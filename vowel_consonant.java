package May_15;

import java.util.Scanner;

public class vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char :");
		char c=sc.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("vowel");
			break;
			
		default:
			System.out.println("consonant");
			
		}
		

	}

}
