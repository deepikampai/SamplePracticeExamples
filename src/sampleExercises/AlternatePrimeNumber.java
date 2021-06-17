package sampleExercises;

public class AlternatePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		
		System.out.print("Alternate prime numbers up to " + num+" are: ");    
		printAlternatePrimeNumber(num);   
		
	}

	private static void printAlternatePrimeNumber(int num) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i <=num; i++) {
			int temp =2;
			int prime = checkPrime(i);
			if(prime ==1) {
				if(temp % 2 ==0) {
//					System.out.println(i +"its prime");
					System.out.println(i + " ");
					temp++;
				}
				
			}else {
				System.out.println(i +"is not prime");
			}
		}
		
	}

	private static int checkPrime(int num) {
		// TODO Auto-generated method stub
		int flag =0;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			return 1;
		}else 
			return 0;
	}

}
