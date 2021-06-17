package sampleExercises;

import java.util.Scanner;

public class PosNegTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check:");
		int intnum = sc.nextInt(); 
		int intresult = Integer.signum(intnum);
		System.out.println(intresult);
//		if(input > 0) {
//			System.out.println(input +" is positive number");
//		}else if(input < 0){
//			System.out.println(input +" is negative number");
//		}else
//			System.out.println(input +" is zero");
		double input = sc.nextDouble(); 
		double result =Math.signum(input);
		System.out.println(result);
	}

}
