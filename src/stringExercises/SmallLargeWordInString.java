package stringExercises;

public class SmallLargeWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hardships often prepare ordinary people for an extraordinary destiny ";
		String small=  " ";
		String large=  " ";
		String[] words = str.split(" ");
		int min = words[0].length();
		for(int i = 0; i < words.length; i++) {
			 
			if(words[i].length() < min) {
				min = words[i].length();
				small =  words[i];
			}
			
		}
		System.out.println("min:" +min );
		System.out.println("small word:" +small );
		
		
		int max = words[0].length();
		for(int i = 0; i< words.length; i++) {
			if(words[i].length() > max) {
				max = words[i].length();
				large = words[i];
			}
		}
		System.out.println("max:" +max );
		System.out.println("large word:" +large );
	}

}
