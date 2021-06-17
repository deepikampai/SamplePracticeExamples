package stringExercises;

import java.util.Arrays;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Big black bug bit a big black dog on his big black nose bug"; 
		int count = 1;
		
		str = str.toLowerCase();
		System.out.println("String in lowercase:" +str);
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(int i=0; i< words.length; i++) {
//			System.out.println(words[i]);
			count = 1;
			for(int j = i+1; j <words.length ;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
				
			}
			
			if(count > 1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}
		
		
//		 for(int i = 0; i < words.length; i++) {    
//	            count = 1;    
//	            for(int j = i+1; j < words.length; j++) {    
//	                if(words[i].equals(words[j])) {    
//	                    count++;    
//	                    //Set words[j] to 0 to avoid printing visited word    
//	                    words[j] = "0";    
//	                }    
//	            }    
//	                
//	            //Displays the duplicate word if count is greater than 1    
//	            if(count > 1 && words[i] != "0")    
//	                System.out.println(words[i]);    
//	        }    
	}

}
