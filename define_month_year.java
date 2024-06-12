package May_15;

public class define_month_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=401;
		
		int year=days/365;
		System.out.println(year);
		int rem=days%365;
		
		int month=rem/30;
		System.out.println(month);
		int rem2=rem%30;
		
		int week=rem2/7;
		System.out.println(week);
		
		int day =rem2%7;
		System.out.println(day);
		
		
		

	}

}
