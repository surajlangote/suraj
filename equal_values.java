package May_15;

public class equal_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=30;
		int num3=10;
		
		if(num1==num2 && num2==num3 && num3==num1) {
			System.out.println("num1==num2==num3");
		}
		else if(num1>=num2 && num1>=num3) {
			System.out.println("num2 is greater than num1 && num3");
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("num2 is greater than num1 && num3");
		}
		else {
			System.out.println("num3 is greater than num2 && num1");
		}
		

	}

}
