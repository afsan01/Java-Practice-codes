package newJava;

public class FindArmstrongNumber {
			//153
			//1*1*1 =1
			//5*5*5 =125
			//3*3*3 =27
			//1+125+27=153
	public static void isAmstronNumber(int num) {
		int cube=0;
		int r;
		int t=num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("This is an Amstrong Number");
		}
		else {
			System.out.println("This is not an Amstrong Number");
		}
	}

	public static void main(String[] args) {

		isAmstronNumber(0);
	}

}
