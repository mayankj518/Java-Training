package week1;

public class Operators {

	public static void main(String[] args) {
		int a=10,b=5;
		boolean c=true,d=false;
		double e=10.5,f=5.5;
		System.out.println(a+b); //Arithmetic Operators
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a*b);
		System.out.println();
		
		System.out.println(a>b); //Relational Operators
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println();
		
		System.out.println(c && d); // Logical Operators
		System.out.println(c || d);
		System.out.println(!c);
		System.out.println();
		
		System.out.println(a+=b); //Assignment Operators
		System.out.println(a-=b);
		System.out.println();
		
		Operators o;     //instance of operator
		Operators op = new Operators();
		System.out.println(op instanceof Operators);
//		System.out.println(o instance of Operators);
		
//		 Conditional Operator (Ternary Operator)
		System.out.println((a>=b)?"a is greater than or equal to b":"b is greater than a");
		
		
		
	}

}
