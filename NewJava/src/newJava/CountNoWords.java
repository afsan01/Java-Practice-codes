package newJava;

import java.util.HashMap;
import java.util.Map;

public class CountNoWords {

	public static void main(String[] args) {

		String st = "I am learning learning java java programming is is";
		String [] splt = st.split(" ");
		
		HashMap <String, Integer> hp = new HashMap <String,Integer>();
		for(int i=0; i<splt.length;i++) {
			if(hp.containsKey(splt[i])) {
				Integer count = hp.get(splt[i]);
				hp.put(splt[i], count+1);
			}
			else {
				hp.put(splt[i], 1);
			}
		}
		for(String x: hp.keySet()) {
			System.out.println("The count of word :"+x+" = "+hp.get(x));
		
	
		}
		
	}
}
