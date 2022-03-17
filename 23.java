package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int c;
		c = in.nextInt();
		int d;
		d = in.nextInt();

		for(int i = 1000; i >= 0; i--) {
			if(a*i*i*i+b*i*i+c*i+d == 0)
				System.out.print(i+" ");
		}

		in.close();

	}

}
