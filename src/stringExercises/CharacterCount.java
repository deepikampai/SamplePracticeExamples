package stringExercises;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "The best of both worlds";
		System.out.println("lenght of the string with blank spaces :" +string.length());
		
		int count = 0;
//		for(int i = 0; i <string.length(); i++) {
//			if(string.charAt(i) != ' ') {
//				count++;
//			}
//		}
//		System.out.println("total charachters:" +count);
		
		String s = string.replaceAll("\\s", "");
		System.out.println(s);
	}

}
