import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {70,20,10,41,50,10};
		int key = 70;
		Arrays.sort(values);
		int result = Arrays.binarySearch(values, key);
		
		if(result < 0) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at:" +result);
		}
	}

}
