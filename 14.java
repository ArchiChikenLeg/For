package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		
		for(int i=1; i<=a; i++) {
			if( a%i == 0)
				System.out.print(i + " ");
		}
		
		in.close();

	}

}
