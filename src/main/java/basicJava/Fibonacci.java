package basicJava;

import java.util.Scanner;

public class Fibonacci {
	
	static void fib(int num) {
		
		int temp = 0;
		for(int i = 0; i<num;) {
			if(i == 0) {
				System.out.println(1);
				i++;
				continue;
			}
			int c = temp;
			temp = i;
			i += c;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		fib(num);

	}

}
