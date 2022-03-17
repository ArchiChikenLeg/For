package demo;

import java.util.Scanner;

public class For {
	public static int fact(int a) {
		int fact = 1;
		for(int i = 1; i <= a; i++)
			fact*=i;
		return fact;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		double res = 1;
		for(int i = 1; i <= n; i++)
			res+=1.0/fact(i);
		System.out.println(res);
		in.close();

	}

}
