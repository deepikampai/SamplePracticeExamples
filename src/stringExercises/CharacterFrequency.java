package stringExercises;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Picture Perfect";
		
		int[] freq = new int[str.length()];
		char[] string = str.toCharArray();
		
		for(int i = 0; i < str.length();i++) {
			freq[i] =1;
			for(int j = i+1 ; j< str.length();j++) {
//				if(str.charAt(i) == str.charAt(j)) {
				if(string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
			}
//			System.out.println(string[i] +","+ freq[i]);
		}
		
		for(int i =0;i< freq.length;i++) {
			if(string[i] != ' ' && string[i] != '0') {
				 System.out.println(string[i] + "-" + freq[i]);
			}
		}
		
	}

}
