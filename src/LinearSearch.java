
public class LinearSearch {
	
	public static int lSearch(int[] data, int element) {
		for(int i = 0; i<data.length; i++) {
			if(data[i] == element){
				return i;
			}				
		}
		return -1;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {10,20,30,41,50};
		int key = 30;
		
		for(int i = 0; i<values.length; i++) {
			if(values[i] == key) {
				System.out.println("Value found at:" +i);
			}
		}
		
		System.out.println("Value found at:" +lSearch(values,key));
	}

}
