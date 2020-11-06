package newJava;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortedDesc {

	public static void main(String[] args) {
		
		Integer arr[]= {20,10,0,45,-5,100};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
