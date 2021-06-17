package stringExercises;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Test";
		String str2 = "ETTs";
		String str3 = "dummy";
		if(str1.length()== str2.length()) {
			System.out.println(str1 +"," + str2 + "can be anagram");
		}else if(str1.length()== str3.length()) {
			System.out.println(str1 +"," + str3 + "can be anagram");
		}else {
			System.out.println(str1 +"," + str3 + "cannot be anagram");
		}
		
		char[] text1 = str1.toLowerCase().toCharArray();
		char[] text2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(text1);
		System.out.println(Arrays.toString(text1));
		
		String updatedStr1 = String.valueOf(text1);		
		System.out.println("updatedStr1: " +updatedStr1);
		
		Arrays.sort(text2);
		System.out.println(Arrays.toString(text2));
		if(Arrays.equals(text1, text2) == true) {
			System.out.println(String.valueOf(text1) +"," + text2.toString() + "can be anagram");
		}else {
			System.out.println("not anagram");
		}
		
	
	}

}
