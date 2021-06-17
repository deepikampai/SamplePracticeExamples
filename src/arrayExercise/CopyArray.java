package arrayExercise;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {5,6,7};
		int[] array2 = new int[3];
		for(int i=0; i< array1.length;i++) {
			array2[i] = array1[i];
		}
		for(int i: array1) {
			System.out.println(i + " ");
		}
		for(int i: array2) {
			System.out.println(i + " ");
		}
	}

}
