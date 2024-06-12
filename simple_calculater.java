package May_15;

import java.util.Scanner;

public class simple_calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("choose option :");
		System.out.println("1.add\n2.sub\n3.mul\n4.div");
		
		int ch;
		System.out.println("enter your choice:");
		ch=sc.nextInt();
		int c;
		switch(ch) {
		case 1:
		  c=a+b;
			System.out.println(c);
		    break;
		    
		case 2:
			 c=a-b;
			System.out.println(c);
		    break;
		    
		case 3:
			 c=a*b;
			System.out.println(c);
		    break;
		    
		case 4:
			 c=a/b;
			System.out.println(c);
		    break;
		    
		default:
		{
			System.out.println("invalid");
		}
		
		    
	
		
		}

	}

}
