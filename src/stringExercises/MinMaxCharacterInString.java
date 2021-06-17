package stringExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinMaxCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "graaaaass is greener on the other side";   
		 int freq[] = new int[str.length()];
		 
		 char[] letters = str.toCharArray();
		 
		 Map<Character,Integer> charCount = new HashMap<>();
		 
		 for(int i = 0; i < letters.length; i++) {
			 freq[i] = 1;
			 for(int j = i+1 ; j<letters.length; j++) {
				 if(letters[i] == letters[j] && letters[i] != ' ' && letters[i] != '0') {
					 freq[i]++;
					 letters[j] = '0';
				 }
			 }
			 if(letters[i] != ' ' && letters[i] != '0') {
				 System.out.println(letters[i] + "," +freq[i]);
//				 charCount.put(letters[i],freq[i]);
			 }
		 }
		 

		 int min= freq[0]; int max =  freq[0];
//		 min = freq[0];
		 char minStr = ' ';
		 char maxStr = ' ';
		 for(int i = 0 ; i < freq.length ;i++) {

			 if(freq[i] < min ) {
				 min = freq[i];
				 minStr = letters[i];
			 }
			 if(freq[i]> max) {
				 max =  freq[i];
				 maxStr = letters[i];
			 }			 
		 }
		 System.out.println("min:" +min);
		 System.out.println("minStr:" +minStr);
		 System.out.println("max:" +max);
		 System.out.println("maxStr:" +maxStr);
		
		 
//		 for(Map.Entry<Character, Integer> data : charCount.entrySet()) {
//			 System.out.println(data.getKey() + "," + data.getValue());		
// 
//		 
//		 char minChar=' ';
//		 Integer minValue = new Integer(0);
//		 Iterator itr = charCount.keySet().iterator();
//		 while(itr.hasNext()) {
//			 Character c = (Character)itr.next();
//			 Integer i = charCount.get(c);
//			 if(minChar == ' ') {
//				 minChar = c;
//				 minValue = i;
//			 }else {
//				 
//			 }
//		 }
		 
	
		
	  
	
	}
}
