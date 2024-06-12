package May_15;

import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		
		int a=sc.nextInt();
		System.out.println("a ="+a);
		
		double myvar=sc.nextDouble();
		System.out.println("myvar value ="+myvar);

		boolean b1=sc.nextBoolean();
		System.out.println("b1 ="+b1);

		float myfloat=sc.nextFloat();
		System.out.println("myfloat ="+myfloat);

		char ch=sc.next().charAt(0);
		System.out.println("char ="+ch);


	}

}
