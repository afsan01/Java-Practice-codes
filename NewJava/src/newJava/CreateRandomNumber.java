package newJava;

import java.util.HashSet;
import java.util.Random;

public class CreateRandomNumber {

	public static void main(String[] args) {
		
		Random randNum=new Random();
		HashSet<Integer> rand= new HashSet<Integer>();
		while(rand.size() !=500) {
			int num=randNum.nextInt(900)+100;
			rand.add(num);
		}
		System.out.println(rand);
		System.out.println(rand.size());

	}

}
