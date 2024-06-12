package May_15;

public class digits_of_number {
	
// write a program to count number of digits of number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int count=0;
		
		while(num>0) {
			 num=num/10;
			 count++;
			}
		System.out.println("Number Count :"+count);
	}

}
