package demo;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int res = 1;
		for(int i = 1; i <= n; i++)
			res*=2;
		System.out.println(res);
		in.close();

	}

}
