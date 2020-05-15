package week1;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=1;i<=n;i++){
			arr[i-1] = i;
		}
		
		System.out.println("Printing Array Elements: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// Enhanced For loop
		for(int x:arr){
			System.out.print(x + " ");
		}
		
		scan.close();
	}

}
