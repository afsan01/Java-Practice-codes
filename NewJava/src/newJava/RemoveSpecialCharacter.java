package newJava;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String str= "<>?&Mahbu^%b1234^)";
		String str1=str.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(str1);
	}

}
