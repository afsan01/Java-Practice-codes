package newJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 40000);
		compMap.put("Cisco", 15000);
		System.out.println("Comp map size: " + compMap.size());

		Iterator it = compMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + "=" + pairs.getValue());
		}

		System.out.println("-------------------");

		// Convert hashmap keys into ArrayList
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		System.out.println("Total comp count=" + compNameList.size());
		for (String t : compNameList) {
			System.out.println(t);
		}
		System.out.println("-------------------");
		// Convert hashmap keys into ArrayList
		List<Integer> EmpValueList = new ArrayList<Integer>(compMap.values());
		System.out.println("Total comp emp count=" + EmpValueList.size());
		for (Integer e : EmpValueList) {
			System.out.println(e);
		}

	}

}
