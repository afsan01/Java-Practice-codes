package newJava;

public class Convert2dTo1Array {

	public static void main(String[] args) {

		int arr[][]= {{4,5,6,7},{10,11,12,14}};
		
		int arr1[]=new int[4];
		int arr2[]=new int[4];
		for(int i=0;i<=1; i++) {
			for(int j=0;j<=3; j++) {
				arr1[j]=arr[0][j];
				arr2[j]=arr[1][j];
			}
		}
		System.out.println("This is First array");
		for(int i=0; i<=3;i++) {
			System.out.println(arr1[i]+"  ");
		}
		System.out.println("This is second array");
		for(int i=0; i<=3; i++) {
			System.out.println(arr2[i]+"  ");
		}
	}

}
