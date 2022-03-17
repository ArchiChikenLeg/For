package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		
		int count = 0;
		for(int i = a; i != 0; i/=10) {
				count+=i%10;
		}
		System.out.print(count);
		in.close();

	}

}
