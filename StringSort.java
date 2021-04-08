package lab2.assignment;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		String[] a = new String[n+1];
		System.out.println("Enter the elements of array:");
		for(int i =0; i < n+1; i++) {
			a[i] = sc.nextLine();
		}
		StringSort obj = new StringSort();
		String[] s = obj.stringSort(a, n+1);
		for(String index : s) {
			System.out.println(index);
		}
	}
	public String[] stringSort(String[] a, int n) {
		String temp = "";
		for(int i =0; i < n; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i].compareTo(a[j]) >0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		String s1, s2;
		int mid;
		for(int i = 0; i < a.length; i++) {
		mid = (int) Math.ceil(a[i].length()/2.0);
		s1 = (a[i].substring(0,mid)).toUpperCase();
		s2 = (a[i].substring(mid,a[i].length())).toLowerCase();
		a[i] = s1 + s2;
		}
		return a;
	}

}

