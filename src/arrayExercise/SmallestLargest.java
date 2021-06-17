package arrayExercise;

import java.util.Arrays;
import java.util.Collections;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] small = {3,7,9,1,8};
			System.out.println("small Array length: " + small.length);
			int min = small[0];
			for(int i =0 ;i < small.length ;i++) {
				
				if(small[i] < min) {
					min = small[i];
				}
			}
			System.out.println("Smallest element present in given array: " + min);

			
			
			
			int[] large = { 7, 6, 45, 21};
			System.out.println("large Array length: " + large.length);
			int max = large[0];
			for(int i =0; i< large.length; i++) {
				if(large[i]>max) {
					max = large[i];
				}
			}
			System.out.println("Largest element present in given array: " + max);
			
 	}

}
