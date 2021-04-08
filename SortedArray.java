package lab2.assignment;

import java.util.Scanner;

public class SortedArray {

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i =0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		SortedArray obj = new SortedArray();
		int[] arr = obj.getSorted(a, n);
		for(int data:arr) {
			System.out.println(data);
		}
	}
	public int[] getSorted(int[] a, int n) {
		int k =0;
		for(int i=0;i<n;i++) {
			a[i]=reverse(a[i]);
		}
		int temp = 0;
		for(int i =0; i < n ;i++) {
			for(int j =0; j < n; j++) {
				if(a[i] <a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	public static int reverse(int num) {
		int  reversed = 0;

		   while(num != 0) {
		   
		     int digit = num % 10;
		       reversed = reversed * 10 + digit;
		       num /= 10;
		   }
		   return reversed;
		}*/
	public static int[] getSorted(int ar[]) {
		int t=0;
		for(int i=0;i<ar.length;i++) {
		ar[i]=reverse(ar[i]);
		}

		 for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
		if(ar[i]<ar[j]) {
		t=ar[i];
		ar[i] = ar[j];
		ar[j] = t;
		}
		}
		}
		return ar;
		}
		public static int reverse(int num) {
		int  reversed = 0;

		 while(num != 0) {

		   int digit = num % 10;
		     reversed = reversed * 10 + digit;
		     num /= 10;
		 }
		 return reversed;
		}
		public static void main(String[] args) {
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++)  
		{  
		arr[i]=sc.nextInt();  
		}
		int[] arr1 = getSorted(arr);
		for(int data:arr1) {
			System.out.println(data);
		}

		}

}
