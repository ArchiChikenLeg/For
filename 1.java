package demo;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++)
			sum+=i*i;
		System.out.println(sum);
		in.close();

	}

}
