package week1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
//		While loop
		int i=1,value=1;
		while(i<=n){
			int j=1;
			while(j<=i){
				System.out.print(value+" ");
				value++;j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println();
		
//		For loop
		value=1;
		for(i=1;i<=n;i++){
			for(int j=1;j<=i;j++,value++){
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
//		Do While loop
		i=1;value=1;
		do{
			int j=1;
			do{
				System.out.print(value+" ");
				value++;j++;
			}
			while(j<=i);
			System.out.println();
			i++;
		}while(i<=n);
		
		
		scan.close();
		
	}

}
