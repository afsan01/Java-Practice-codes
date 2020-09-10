package newJava;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChar {

	public static void main(String[] args) {

		String str = "programminggggggggg";
		

		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count =1;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for (Character Char : map.keySet()) {
			if (map.get(Char) >0) {

				System.out.println(Char + " : " + map.get(Char));
			}
		}
	}
}
