package May_15;

public class Nested_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		int b=50;
		int c=30;
		if(a>b) {
			if(a>b) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("b is greater");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		

	}

}
