package Tandem20;

public class Application1 {
public static void main(String[] args) {
	int[] array2 = { 44, 29, 315, 88, 657, 154, 587, 345, 12, 99, };
	boolean isSorted = false;
	
	int data = 0;
	while (! isSorted) {
		isSorted = true;
		for (int i = 0; i < array2.length - 1; i++) {
			if(array2[i] > array2[i+1]) {
				isSorted = false;
				data = array2[i];
				array2[i] = array2[i+1];
				array2[i+1] = data;
			}
		}
	}
	showArray(array2);
}
	static void showArray(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
			System.out.println();
		}
}
}
