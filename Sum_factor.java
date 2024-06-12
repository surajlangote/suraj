package May_15;

public class Sum_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=30;
	    int sum=0;
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);

	}

}
