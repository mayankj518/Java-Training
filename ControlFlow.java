package week1;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mark = scan.nextInt();
		char grade;
		if(mark>=90) grade='A';
		else if(mark>=80) grade='B';
		else if(mark>=70) grade='C';
		else if(mark>=60) grade='D';
		else if(mark>=40) grade='E';
		else grade='F';
		
		System.out.println("Final Grade is: " + grade);
		
		scan.nextLine();

//		Switch Case
		char n = scan.nextLine().charAt(0);
		switch (n){
		case 'B':
			System.out.println("Java");
			break;
			
		case 'C':
			System.out.println("Python");
			break;
			
		case 'D':
			System.out.println("C++");
			break;
			
		default:
			System.out.println("Love all Languages");
			break;
		}
		
		
		scan.close();
	}

}
