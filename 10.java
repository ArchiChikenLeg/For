package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		
		int count = 0;
		for(int i = a; i != 0; i/=10) {
			if(i%10 == b)
				count++;
		}
		System.out.print(count);
		in.close();

	}

}
