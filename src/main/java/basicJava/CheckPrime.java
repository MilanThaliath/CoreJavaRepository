package basicJava;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		checkPrime(num);
		
	}

	static void checkPrime(int num) {
		
		boolean check =true;
		for(int i =2; i<num-1; i++)
		{
			if(num%i==0)
			{
				check = false;
				break;
			}
		}
		
		if(check == true) {
			System.out.println(num + " is Prime");
		}
		else {
			System.out.println(num + " is not Prime");
		}
		
	}

}
