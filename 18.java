package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int count = 0;
		int res = 0;
		for(int i=n; i != 0; i/=10)
			count++;
		System.out.println(count);
		for(int i=n; i != 0; i/=10) {
			count--;
			res+=i%10*Math.pow(2, count);
		}
		System.out.println(res);
		in.close();

	}

}
