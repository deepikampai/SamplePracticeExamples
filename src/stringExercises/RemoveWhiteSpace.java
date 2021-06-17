package stringExercises;

public class RemoveWhiteSpace {
	public static void main(String[] args) {    
        
        String str1="   Remove white spaces.       ";    
            
        System.out.println("trim:" +str1.trim());
          
           
        String newStr="";
        for(int i = 0; i <str1.length(); i++) {
        	
//			if(str1.charAt(i) != ' ') {
//				newStr= newStr+str1.charAt(i);
//			}
        	
        	if(str1.charAt(i) == ' ') {
        		continue;
        	}else {
        		newStr= newStr+str1.charAt(i);
        	}		
			
		}
        System.out.println("String after removing all the white spaces : " + newStr);
           
      //Removes the white spaces using regex    
//      str1 = str1.replaceAll("\\s+","");
//        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}
