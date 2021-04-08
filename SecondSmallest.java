package lab2.assignment;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i =0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		SecondSmallest obj = new SecondSmallest();
		int res = obj.getSecondSmallest(a,n);
		System.out.println(res+" is the second smallest element in given array");
	}
	public int getSecondSmallest(int[] a, int n) {
		int temp = 0;
		for(int i= 0; i < n ;i++) {
			for(int j = 0; j < n; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

}
