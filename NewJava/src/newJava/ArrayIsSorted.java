package newJava;

public class ArrayIsSorted {

	public static void main(String[] args) {
		
		SortedArray();
		
	}
	public static void SortedArray() {
		
		int arr[]= {4,2,3,1,5,6};
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
