package demo;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		
		int count = 0;
		int res = 0;
		for(int i = a; i != 0; i/=10)
				count++;
		for(int i = a; i != 0; i/=10) {
			count--;
			res+=(i%10)*Math.pow(10, count);
		}
			
		System.out.print(res);
		in.close();

	}

}
