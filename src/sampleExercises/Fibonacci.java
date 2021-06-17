package sampleExercises;

public class Fibonacci {
	
	static int n1 = 0, n2 = 1;
	public static void fibonacciFunction(int count){
		while(count > 0) {
		int n4 = n1 + n2;
		n1 = n2;
		n2 = n4;
		count--;
		System.out.print( " " +n4);
//		System.out.println( count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1 = 0, n2 = 1;
		int n3, count = 10;
		System.out.print(n1 +" " + n2);
		//0 1 1 2 3 5 8 13 21 34
		
//		for(int i =2; i < 10; i++) {
//			count = i;
//			n3 = n1+n2;
//			System.out.print( " " +n3);
//			n1 = n2; 
//			n2 = n3;
//		}
		
		fibonacciFunction(count-2);
		
		
	}

}
