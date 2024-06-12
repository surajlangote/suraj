package May_15;

public class Total_salary {
	
// write a program to input basic salary of an employee and calculate its total salary to following
	// base_salary = 10000 : house_rent = 20% other =80%
	// base_salary = 20000 : house_rent = 25% other =90%
	// base_salary = 20000 : house_rent = 30% other =95%
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base_salary=12000;
		float house_rent;
		float other;
		
		if(base_salary<=10000) {
			house_rent=base_salary*0.2f;
			other=base_salary*0.8f;
		}
		else if(base_salary<=20000) {
			house_rent=base_salary*0.25f;
			other=base_salary*0.9f;
		}
		else {
			house_rent=base_salary*0.3f;
			other=base_salary*0.95f;
		}
		float total_salary=base_salary+house_rent+other;
		System.out.println(total_salary);

	}

}
