package sampleExercises;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		
		for(int i = 0; i <= 5; i++) {
			for(int j=0 ; j<= i; j++) {
			System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5; i >= 0; i--) {
			for(int j=0 ; j<= i; j++) {
			System.out.print("*" + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i <= row; i++) {
			for(int j=2 *(row-i) ; j>= 0; j--) {
				System.out.print( " " );
				}
			for(int k=0 ; k<= i; k++) {
				System.out.print( " *" );
				}
			System.out.println();
			}
		
		for(int i = 0; i<= row; i++) {
			for(int j=row-i ; j>= 0; j--) {
				System.out.print( " " );
				}
			for(int k=0 ; k<= i; k++) {
				System.out.print( " *" );
				}
			System.out.println();
		}
		
		int number = 1;
		for(int i = 0; i<= row; i++) {
//			int number = 1;
			for(int j = 0; j<= i; j++) {
				System.out.print(number + " " );
				number = number + 1;
				
			}
			System.out.println();
		}
			
		
		for(int i = 0; i<= row; i++) {
			int result = 1;
			for(int j = 0; j<= i; j++) {
				System.out.print(result + " " );
				result = result + 1;				
			}
			System.out.println();
		}
		
		for(int i = 1; i<= row; i++) {
			
			for(int j = 1; j<= i; j++) {
				System.out.print(i + " " );			
			}
			System.out.println();
		}
		
		for(int i = 8; i>= row; i--) {
			
			for(int j = 8; j>= i; j--) {
				System.out.print(j+ " " );			
			}
			System.out.println();
		}
		
		}	

}
