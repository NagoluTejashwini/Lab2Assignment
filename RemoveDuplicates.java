package lab2.assignment;

import java.util.Scanner;

public class RemoveDuplicates {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n = sc.nextInt();
	int arr1[] = new int[n];
	int arr2[] = new int[n];
	System.out.println("Enter the  values for array");
	for(int i=0;i<n;i++) {
		arr1[i] = sc.nextInt();
	}
	arr2 = modifyArray(arr1);
	printArray(arr2);
}

private static int[] modifyArray(int[] arr)
{
	int[] a1 = new int[arr.length];
	int a = 0;
	for(int i=0;i<arr.length;i++)
	{
		boolean c= false;
		for(int k=0;k<i;k++)
		{
			if(arr[i] ==arr[k])
			{
				c=true;
				break;
			}
		}
		if(!c)
		{
			a1[a] = arr[i];
			a++;
		}
	}
	int temp = 0;
	for(int i =0; i < a1.length;i++) {
		for(int j = 0; j < a1.length; j++) {
			if(a1[i] > a1[j]) {
				temp = a1[i];
				a1[i] = a1[j];
				a1[j] = temp;
			}
		}
	}
	return a1;
}
	private static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				break;
			System.out.print(arr[i] +" ");
		}
	}
}
