package stringExercises;

public class StringSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "good";
		String str2 = "morning";
				
		str1 = str1 +str2;
		System.out.println("joinedName:" +str1);
		
//		str2 = str1.substring(0, 4);
		str2 = str1.substring(0, (str1.length() - str2.length()));
		System.out.println("string2:" +str2);
		
//		str1 = str1.substring(4);
		str1 = str1.substring(str2.length());
		System.out.println("string1: "+str1); 	
	}

}
