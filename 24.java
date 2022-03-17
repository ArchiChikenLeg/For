package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int count = 0;
		for(int i = 1; i<=n && count!=n; i++) {
			for(int j=0; j < i && count!=n; j++) {
				System.out.print(i+" ");
				count++;
			}
		}

		in.close();

	}

}
