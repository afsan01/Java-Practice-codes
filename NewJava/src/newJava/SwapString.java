package newJava;

public class SwapString {

	public static void main(String[] args) {

		String a= "Hello";
		String b = "Word";
		System.out.println("Before Swapping");
		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);
		
		//Append a and b:
		a = a+b;
		//store intial string a in String b
		b = a.substring(0, a.length()-b.length());
		
		//store initial String b in String a
		a=a.substring(b.length());
		
		System.out.println("The value of a and b after swapping");
		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);
		
	}

}
