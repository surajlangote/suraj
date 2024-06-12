package May_15;

public class prime_factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5; //1*2*3*4*5=120
		int fact=1;
		
		for(int i=2; i<=n; i++)
		{
			fact=fact*i;
		}
		
		int count=0;
		
		while(fact%2==0) {
			
			count++;
			fact=fact/2;
		}
		
		System.out.println(count);

	}

}
