package arrayExercise;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arraySort = {3,7,9,3,6,1,9,8,21,4};
			System.out.println("Array length: " + arraySort.length);
			
//			int temp =0;
//			for(int i=0; i< arraySort.length; i++) {
//				for(int j = i+1; j< arraySort.length; j++) {
//					if(arraySort[i] > arraySort[j]) {
//						temp = arraySort[i];
//						arraySort[i] = arraySort[j];
//						arraySort[j] = temp;
//					}
//				}
//			}
			
			Arrays.sort(arraySort);
			System.out.println("sorted array:" + Arrays.toString(arraySort));
			
//			 Arrays.sort(arraySort, 1, 5);
//			 System.out.println("sorted sub array: " + Arrays.toString(arraySort));
			
			Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("arrays in reverse order:" + Arrays.toString(arr));
			
 	}

}
