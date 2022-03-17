package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int a;
		int count = 0;

		for(int i = 0; i < n; i++) {
			a = in.nextInt();
			if(a == 0)
				count++;
		}
		System.out.println(count);
		in.close();

	}

}
