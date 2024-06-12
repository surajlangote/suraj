package May_15;

public class Reverse_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1234;
		
		int num2=0;
		while(num1>0) {
			
			//take rem
			int rem=num1%10;
			
			num2=num2*10;
			num2=num2+rem;
		
			//take que
			num1=num1/10;
		}
		
		System.out.println(num2);
		
	}

}
