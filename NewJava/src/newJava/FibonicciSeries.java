package newJava;

public class FibonicciSeries {

	public static void main(String[] args) {
		
		Fibonicci(10);

	}
	public static void Fibonicci(int num) {
		
		int a =1;
		int b =0;
		System.out.println(b);
		System.out.println(a);
		
		int c;
		for(int i=2; i<num; i++) {
			c = b;
			b=a;
			a= c +b;
			System.out.println(a);
		}
	}

}
