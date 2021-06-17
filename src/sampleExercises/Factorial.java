package sampleExercises;

public class Factorial {
	public static void main(String args[]) {
		int num = 5;
		int factResult =1;
	
		for(int i = 1; i<= num ; i++) {
			factResult = factResult * i;
		}
		System.out.println("Factorial result:" +factResult);
		
		factorial(4);
	}

	private static void factorial(int i) {
		int Result =1;
		for(int j = 1; j<= i ; j++) {
			Result = Result * j;
		}
		System.out.println("Factorial result:" +Result);
		
	}

}
