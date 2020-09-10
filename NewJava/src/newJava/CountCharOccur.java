package newJava;

public class CountCharOccur {

	public static void main(String[] args) {

		String str = "Java is a object oriented language";
		
		int result = str.length()-str.replaceAll("a", "").length();
		System.out.println(result);
	}

}
