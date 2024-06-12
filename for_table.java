package May_15;

import java.util.Scanner;

public class for_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");
		
		n=sc.nextInt();
		for(i=1; i<=10; i++)
		{
			System.out.println(n+" * "+i+"="+n*i);
		}

	}

}
