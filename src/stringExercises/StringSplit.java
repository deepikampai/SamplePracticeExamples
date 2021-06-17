package stringExercises;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "016-78967";
		String[] newStr = str.split("-");
		for(int i =0; i< newStr.length; i++) {
			System.out.println("values:" +newStr[i]);
		}
		
		for(String t: newStr) {
			System.out.println(t);
		}
		
		System.out.println(Arrays.toString(newStr));
	}

}
