package stringExercises;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "KAYAK";
		String str = "KAYAKS";
		
		String str2="";
		for(int i=str.length()-1; i>=0;i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println("string2:" +str2);
		
		if (str.equals(str2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}
	}

}
