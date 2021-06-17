package com.java8Features.ParallelSort;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {5,8,3,1,9,-3};
		System.out.print("Initial Array Values:");
		for(int i : intArray) {
			System.out.print(i );
		}
		System.out.println();
		System.out.println("******************");
//		System.out.print("With Arrays sort:");
//		Arrays.sort(intArray);
//		for(int i : intArray) {
//			System.out.println(+i);
//		}
		
		System.out.print("With Arrays parallelSort:");
		Arrays.parallelSort(intArray);
		for(int i : intArray) {
			System.out.print(i+" " );
		}
		
		System.out.println();
		System.out.println("Initial Arrays for parallelSort and index:");
		int[] arr = {5,8,1,0,6,9,50,-3};  
		for (int i : arr) {  
            System.out.print(i+" ");  
        }  
		System.out.println();
		System.out.println("With Arrays parallelSort and index:");
		Arrays.parallelSort(arr,2,6);
		for (int i : arr) {  
            System.out.print(i+" ");  
        } 
	}

}
