package newJava;

public class SwapIntWithoutVerb {

	public static void main(String[] args) {

		int x= 40;
		int y= 50;
		System.out.println("Before Swapping \nx="+x+"\ny="+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping without 3rd veriable \nx="+x+"\ny="+y);
	}

}
