package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();

		for(int i = a; i <= b; i++) {
			if(i%2 == 0)
				System.out.print(i + " ");
		}
		in.close();

	}

}
