package arrayExercise;

public class PrintLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int[] number = {25, 11, 7, 75, 56};
		max = number[0];
		for(int i= 0; i< number.length; i++) {
			if(number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("largest number:" + max);
		
	}

}
