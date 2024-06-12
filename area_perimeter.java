package May_15;

import java.util.Scanner;

public class area_perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// write program to print area and perimeter of an circle
	// pi=3.14
	// area=pi*r
	// perimeter=2pir
		
	    int r;
		float pi=3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius :");
		r=sc.nextInt();
		r++;
		float area=pi*r;
		System.out.println("area :"+area);
		
		double peri=2*pi*r;
		System.out.println("perimeter :"+peri);

		

	}

}
