package basicJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class A {

	public static void main(String[] args) {

//		long num;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number: ");
		System.out.println("Enter String: ");
		String str = sc.nextLine();
//		System.out.println("Enter String: ");
//		String str2 = sc.nextLine();
//		num = sc.nextLong();
//		factorial(num);
//		reverseNum(num);
//		checkPalindrome(num);
//		tablesOf(num);
//		countDigits(num);
//		sumOfDigits(num);
		long[] arr = { 22, 45, 56, 78, 67, 99, 45, 77 };
//		long[] arr2 = { 23, 65, 43, 13, 74, 42 };
//		findLargest(arr);
//		findSecondLargest(arr);
//		findSmallest(arr);
//		sumAll(arr);
//		avg(arr);
//		arrayReverse(arr);
//		elementFrequency(arr);
//		sortArray(arr);
//		sortArrayDesc(arr);
//		System.out.println("here");
//		int k = removeDuplicates(arr);
//		for(int i =0; i<k;i++) {
//			System.out.println(arr[i]);
//		}
//		mergeArray(arr,arr2);

//		The quick brown fox jumped over the fence
//		lengthOfString(str);
//		stringConcat(str, str2);
//		stringcompare(str,str2);
//		stringReverse(str);
//		stringPalindrome(str);
//		characterFrequency(str);
//		charachterCount(str);
//		upperAndLower(str);

//		replaceCharacter(str, 'a');
		System.out.println("Enter range to search: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		findSubstring(str, a, b);
		
		

	}

//	29
	private static void findSubstring(String str, int a, int b) {
		String str2 = str.substring(a, b);
		System.out.println(str2);
	}

//	28
	private static void replaceCharacter(String str, char c) {
		str = str.replace(c, 't');
		System.out.println(str);
	}

//	27
	private static void upperAndLower(String str) {

		System.out.println("Upper case: " + str.toUpperCase());
		System.out.println("Lower case: " + str.toLowerCase());

	}

//	26
	private static void charachterCount(String str) {

		char[] ch = str.toCharArray();
		int vowels = 0, consonants = 0;
		char[] vows = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (char c : ch) {
			int flag = 0;
			for (char v : vows) {
				if (c != v) {
					flag++;

				} else if (c == ' ') {
					flag = 0;
					break;
				} else {
					vowels++;
					flag = 0;
					break;
				}
			}
			if (flag != 0) {
				consonants++;
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);

	}

//	25
	private static void characterFrequency(String str) {

		char[] ch = str.toCharArray();
		char[] sorted = ch;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (sorted[i] < sorted[j]) {
					char temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
				}

			}
		}
		int k = 0;
		char[] distinct = new char[str.length()];
		for (int i = 0; i < str.length() - 1; i++) {
			if (sorted[i] != sorted[i + 1]) {
				distinct[k] = sorted[i];
				k++;
			}
		}
		distinct[k++] = sorted[str.length() - 1];
		for (int i = 0; i < k; i++) {
			int count = 0;
			for (char c : sorted) {
				if (distinct[i] == c) {
					count++;
				}
			}
			System.out.println("Frequency of " + distinct[i] + " in string is: " + count);
		}

	}

//	24
	private static void stringPalindrome(String str) {

		String str2 = stringReverse(str);
		if (str.equalsIgnoreCase(str2) == true) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}

	}

	// 23
	private static String stringReverse(String str) {

		char[] ch = str.toCharArray();
		char[] chRev = new char[str.length()];
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			chRev[j] = ch[i];
			j--;
		}
		String strRev = "";
		for (char c : chRev) {
			strRev += c;
		}

		System.out.println(strRev);
		return strRev;

	}

	// 22
	private static void stringcompare(String str, String str2) {

		System.out.println(str.compareTo(str2));

	}

	// 21
	private static void stringConcat(String str, String str2) {

		String str3 = str.concat(" " + str2);
		System.out.println(str3);

	}

	// 20
	private static void lengthOfString(String str) {

		System.out.println("Length of String: " + str.length());
		System.out.println(str);

	}

	// 19
	private static void mergeArray(long[] arr, long[] arr2) {
		// TODO Auto-generated method stub
		int l1 = arr.length;
		int l2 = arr2.length;
		long[] arr3 = new long[l1 + l2];
		for (int i = 0; i < l1; i++) {
			arr3[i] = arr[i];
		}
		for (int i = 0; i < l2; i++) {
			arr3[l1 + i] = arr2[i];
		}
		for (long l : arr3) {
			System.out.println(l);
		}
	}

//	18
	private static int removeDuplicates(long[] arr) {

		arr = sortedArray(arr);
		long[] temp = new long[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[k] = arr[i];
				k++;
			}
		}
		temp[k++] = arr[arr.length - 1];
		for (int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}
		return k;
	}

	private static long[] sortedArray(long[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					long t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		return arr;

	}

	// 16
	private static void sortArray(long[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					long t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		for (long l : arr) {
			System.out.println(l);
		}

	}

	// 17
	private static void sortArrayDesc(long[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					long t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		for (long l : arr) {
			System.out.println(l);
		}

	}

	private static void elementFrequency(long[] arr) {

		for (long num : arr) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (num == arr[j])
					count++;
			}
			System.out.println("Frequency of " + num + " is: " + count);
		}

	}

	private static void arrayReverse(long[] arr) {
		int j = arr.length;
		long[] arr2 = new long[j];
		for (int i = 0; i < arr.length; i++) {
			--j;
			arr2[j] = arr[i];
		}
		for (long l : arr2) {
			System.out.println(l);
		}

	}

	private static void avg(long[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		float avg = sum / arr.length;
		System.out.println("Average: " + avg);
	}

	private static void sumAll(long[] arr) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: " + sum);
	}

	private static void findSmallest(long[] arr) {
		// TODO Auto-generated method stub
		long smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);

	}

	private static void findSecondLargest(long[] arr) {

		long largest = 0, second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > second && arr[i] > largest) {
				second = largest;
				largest = arr[i];
			} else if (arr[i] > second && arr[i] < largest) {
				second = arr[i];
			}
		}
		System.out.println(second);

	}

	private static void findLargest(long[] arr) {

		long largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

	}

//	private static void sumOfDigits(long num) {
//		long sum = 0;
//		String str = Long.toString(num);
//		for(int i =0;i<str.length();i++) {
//			Long.getLong(str.charAt(i));
//			sum += (str.charAt(i));
//			System.out.println(sum);
//		}
//		System.out.println("Sum of digits: " + sum);
//		
//	}

	private static void countDigits(long num) {
		String str = Long.toString(num);
		System.out.println("Number of digits in " + num + " is " + str.length());

	}

	private static void tablesOf(long num) {
		System.out.println("Multiplication table of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (i * num));
		}
	}

	private static void checkPalindrome(long num) {

		StringBuilder str = new StringBuilder();
		str.append(num);
		System.out.println();
		String str2 = str.reverse().toString();

		if (str2.equals(str.reverse().toString())) {
			System.out.println(num + " is a Palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}

	}

	private static void reverseNum(long num) {

		StringBuilder str = new StringBuilder();
		str.append(num);
		str.reverse();
		System.out.println("Reversed number is: " + str);

	}

	private static void factorial(long num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);

	}

}
