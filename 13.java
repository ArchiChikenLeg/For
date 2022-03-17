package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		
		int min = a;
		
		for(int i=a; i>1; i--) {
			if( a%i ==0)
				min = i;
		}
			
		System.out.print(min);
		in.close();

	}

}
