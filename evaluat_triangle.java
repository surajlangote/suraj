package May_15;

public class evaluat_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=20;
		if(a==b && b==c) {
			System.out.println("Equilater");
		}
		else if (a==b || b==c ||c==a) {
			System.out.println("isoscelene");
		}
		else {
			System.out.println("scelene");
		}

	}

}
