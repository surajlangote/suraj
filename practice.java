package May_15;

public class practice 
{

	public static void main(String[] args) 
	{

		int i = 1;
		System.out.println("while");
		while (i <= 20) 
		{
			System.out.print(i + " ");
			i++;
		}
//++++++++++++++++++++++++++++++++++++++++++++
		
		System.out.println();
		System.out.println("for");
		for (int a = 1; a <= 20; a++) 
		{
			System.out.print(a + " ");
		}
//+++++++++++++++++++++++++++++++++++++++++++++++
		
		int b = 1;
		System.out.println();
		System.out.println("do while");
		do 
		{
			System.out.print(b + " ");
			b++;
		} 
		while (b <= 20);

	}

}
