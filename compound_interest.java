package May_15;

public class compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1000;
		float r=0.05f;
		int n=2;
		int t=2;
	//  double A=p*(1+r/n)^n*t;
		double first=1+r/n;
		double sec=n*t;
		double A=p*Math.pow(first, sec);
		System.out.println(A);

	}

}
