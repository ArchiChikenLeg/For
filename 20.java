package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int a;
		int cZero = 0;
		int cPlus = 0;
		int cMinus = 0;

		for(int i = 0; i < n; i++) {
			a = in.nextInt();
			if(a>0)
				cPlus++;
			else if(a<0)
				cMinus++;
			else
				cZero++;
		}
		System.out.print(cZero + " ");
		System.out.print(cPlus + " ");
		System.out.print(cMinus);
		in.close();

	}

}
