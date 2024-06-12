package May_15;

import java.util.Scanner;

public class percentage_garde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,s4,s5,s6;
		int total,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		s1=sc.nextInt();	
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		s6=sc.nextInt();
		total=s1+s2+s3+s4+s5+s6;
		avg=total/6;
		if(avg>90) {
			System.out.println("A garde");
		}
		
		else if(avg>80 && avg<90) {
			System.out.println("B garde");
		}
		
		else if(avg>70 && avg<80) {
			System.out.println("C garde");
		}
		
		else if(avg>60 && avg<70) {
			System.out.println("D garde");
		}
		
		else if(avg>50 && avg<60) {
			System.out.println(" Fail");
		}
		else {
			System.out.println("invalid");
		}


	}

}
