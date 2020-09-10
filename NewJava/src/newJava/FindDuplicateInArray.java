package newJava;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,6,2,8,9};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate are: "+arr[j]);
				}
			}
		}
	}

}
