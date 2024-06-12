package May_15;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// write program to print the area and perimeter of an rectangle
	//rectangle -> area ->A=l*w
	//perimeter -> p=2(l+w)
		
		int l,w;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rectangle :");
		l=sc.nextInt();
		w=sc.nextInt();

		int A=l*w;
		System.out.println(A);
		int p=2*(l+w);
		System.out.println(p);
		
		

	}

}
