package May_15;

public class Total_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=57;
		int s2=60;
		int s3=59;
		int s4=63;
		int s5=67;
		int s6=87;
		int total,avg;
		total=s1+s2+s3+s4+s5+s6;
		avg=total/6;
		System.out.println("Total = "+total);
		System.out.println("Avg = "+avg);
		if(avg>90) {
			System.out.println("first");
		}
		else if(avg>80) {
			System.out.println("second");
		}
		else if(avg>70) {
			System.out.println("third");
		}
		else if(avg>60) {
			System.out.println("fourth");
		}
		else if(avg>50) {
			System.out.println("fifth");
		}
		else if(avg<40){
			System.out.println("fail");
		}
		else {
			System.out.println("Invalid enter");
		}
		

	}

}
