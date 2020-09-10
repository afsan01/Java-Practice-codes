package newJava;

public class NewJava {

	public static void main(String[] args) {
		
		FixxBazz();

		int a[]= {1,2,3,4,5,7,8,9,10};
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0; j<=10;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		System.out.println("Missing number is: "+(sum1-sum) );
	}
	public static void FixxBazz() {
		int a= 30;
		for(int i=1;i<=30; i++) {
			if(i%3==0 & i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if (i%5==0){
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
