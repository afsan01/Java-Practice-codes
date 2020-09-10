package newJava;

public class FindPrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i =2; i<num; i++) {
			if(num% i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNumbers(int num) {
		for(int i =2; i<=num; i++) {
			if(isPrimeNumber(i))
				System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		
		//Special number which can divide by itself without any fraction.
	
		System.out.println("2 is prime number: "+isPrimeNumber(2));
		System.out.println("3 is prime number: "+isPrimeNumber(3));
		System.out.println("10 is prime number: "+isPrimeNumber(10));
		System.out.println("13 is prime number: "+isPrimeNumber(13));
		System.out.println("15 is prime number: "+isPrimeNumber(15));
		
		getPrimeNumbers(15);


		

	}

}
