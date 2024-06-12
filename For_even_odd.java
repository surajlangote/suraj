package May_15;

public class For_even_odd {

// write a program to display the number is even or odd
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("even");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("odd");
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}

}
