package May_15;

import java.util.Scanner;

public class calculate_percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,s4,s5,s6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks :");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		s6=sc.nextInt();
		int total,avg;
		total=s1+s2+s3+s4+s5+s6;
		avg=total/6;
		System.out.println("total marks :"+total);
		System.out.println("Per :"+avg);
		
		if(avg>90) {
			System.out.println("A grade");
		}
		else if(avg>80 && avg<90) {
			System.out.println("B grade");
		}
		
		else if(avg>70 && avg<80) {
			System.out.println("C grade");
		}
		else if(avg>60 && avg<70) {
			System.out.println("D grade");
		}
		else if(avg>50 && avg<60) {
			System.out.println("fail");
		}
		else {
			System.out.println("inavalid");
		}
		
		

	}

}
