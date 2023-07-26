package com.java.datastructures.linear;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {2, 3, 5, 7, 4};
		bubbleSort(a);
	}

	private static void bubbleSort(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
