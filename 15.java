package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int count = 0;
		for(int i=1; i<=a; i++) {
			if( a%i == 0)
				count++;
		}
		System.out.println(count);
		in.close();

	}

}
