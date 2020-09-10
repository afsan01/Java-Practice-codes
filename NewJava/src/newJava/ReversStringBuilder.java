package newJava;

public class ReversStringBuilder {

	public static void main(String[] args) {

		String str = "Hossain";
		StringBuilder str1= new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		System.out.println(str1);
		
		OddEven();
		PrintNumber();
		missingNumber();
	}
	public static void OddEven() {
		int x = 351;
		if(x%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	public static void PrintNumber() {
		for(int i=0; i<=25; i+=4) {
			if(i==0) {
				System.out.println(1);
			}
			else {
				System.out.println(i);
			}
		}
		for(int x=20; x>=0; x-=2) {
			System.out.println(x);
		}
 	}
	public static void missingNumber() {
		
		int num = 456123789;
		int rev= 0;
		
		while(num !=0) {
			rev=rev*10 + num%10;
			num= num/10;
		}
		System.out.println("Reverse Integer is: "+rev);
		
	}
}
