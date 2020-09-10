package newJava;

public class ArrayIsSorted {

	public static void main(String[] args) {
		
		SortedArray();
		
	}
	public static void SortedArray() {
		
		int arr[]= {1,2,3,4,5,6};
		System.out.println(isSorted(arr));
	}
	public static boolean isSorted(int a[]) {
		for(int i=0;i<a.length; i++) {
			if(a[i]<a[i+1]) {
				return true;
			}
		}
		return false;
	}
}
