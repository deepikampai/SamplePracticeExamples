package arrayExercise;

public class AlternatePrime {
	public static void main(String[] args) {
		
	
	int arr[] = {1,2,3,4,5};
	
	for(int i =1; i< arr.length; i = i+2) {
//		if( (i == 0) || (i % 2 == 0)) {
//			break;
//		}else {
//			System.out.println(arr[i]);
//		}
		if( (i != 0) && (i % 2 != 0)) {
			System.out.println(arr[i]);
		}
	}
	}

}
