package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int a;
		boolean isZero = false;

		for(int i = 0; i < n; i++) {
			a = in.nextInt();
			if(a == 0)
				isZero=true;
		}
		if(isZero)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();

	}

}
