package newJava;

import java.util.HashMap;
import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {

		CountWord();
		Scanner userInput = new Scanner(System.in);
		String org = userInput.nextLine();
		String rev = ("");

		for (int i = org.length() - 1; i >= 0; i--)
			rev = rev + org.charAt(i);
		System.out.println(rev.replace('d', 'D'));

		if (org.equals(rev)) {
			System.out.println("String is palingdrome");
		} else {
			System.out.println("String is not panindrome");
		}
	}

	public static void CountWord() {
		
		int num=123456789;
		int rev =0;
		while(num !=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse integer is: "+rev);
	}
}
