package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int sum = 0;
		for(int i=1; i<=100; i++) {
			a = in.nextInt();
			sum += a;
		}
		System.out.println(sum);
		in.close();

	}

}
