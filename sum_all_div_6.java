package May_15;

public class sum_all_div_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l=1;
		int r=20;
		
		int sum=0;
				
		for(int i=1; i<=20; i++) {
			if(i%6==0) {
				sum=sum+i;
			}
		}

		System.out.println(sum);
	}

}
