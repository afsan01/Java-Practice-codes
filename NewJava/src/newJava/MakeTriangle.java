package newJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a=0; int b=0; int c=0; int hypot=0;
		
		System.out.println("Enter side 1");
		a=Integer.parseInt(reader.readLine());
		
		System.out.println("Enter side 2");
		b=Integer.parseInt(reader.readLine());
		
		System.out.println("Enter side 3");
		c=Integer.parseInt(reader.readLine());
		
		if(a>b && a>c) {
			hypot=a;
			if(hypot*hypot==(b*b+c*c)) {
				System.out.println("Yup its a right angled triangle "+hypot);
			}
			else {
				System.out.println("Not a right triangle");
			}
		}
		if(b>a && b>c) {
			hypot=b;
			if(hypot*hypot==(a*a+c*c)) {
				System.out.println("Yup its a right angled triangle "+hypot);
			}
			else {
				System.out.println("Not a right triangle");
			}
		}
		if(c>a && c>b) {
			hypot=c;
			if(hypot*hypot==(a*a+b*b)) {
				System.out.println("Yup its a right angled triangle "+hypot);
			}
			else {
				System.out.println("Not a right triangle");
			}
		}
		
		
	}

}
