package newJava;

import java.util.Arrays;

public class AnagramString {
	
	//if two String are same kind of character called Anagram

	public static void main(String[] args) {
		String x = "Hello";
		String y = "lkkjggkj";
		
		char[] arr= x.toLowerCase().toCharArray();
		char[] array=y.toLowerCase().toCharArray();
		Arrays.sort(arr);
		Arrays.sort(array);
		if(Arrays.equals(arr, array)) {
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is not Anagram");
		}
	}

}
