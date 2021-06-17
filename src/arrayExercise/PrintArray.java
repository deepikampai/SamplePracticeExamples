package arrayExercise;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {1,2,3,4,5};
		for(int i: values) {
			System.out.println(i + " ");
		}
		
		String[] names = {"Rita", "Meeta","Geeta"};
		for(int i = 0; i< names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
