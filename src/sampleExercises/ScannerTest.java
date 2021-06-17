package sampleExercises;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter data manually:");
		int intData = scanner.nextInt();
		System.out.println("data entered:" +intData);
		
		System.out.println("enter character data manually:");
		char charData = scanner.next().charAt(2);
		System.out.println("data entered:" +charData);
		
	}

}
