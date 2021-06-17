package stringExercises;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Dream Big";
		String reverseString = "";
		int len = str.length();
		System.out.println("str length:" +len);
		for(int i = str.length()-1; i>= 0; i--) {
			
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Actually String:" +str);
		System.out.println("Reversed String:" +reverseString);
	}

}
