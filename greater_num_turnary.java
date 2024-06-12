package May_15;

import java.util.Scanner;

public class greater_num_turnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		ans=(a>b)?a:(b>c?b:c);
		System.out.println(ans);

	}

}
