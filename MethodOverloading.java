package week1;

public class MethodOverloading {

	static int area(int l,int b){
		return l*b;
	}
	
	static int area(int s){
		return s*s;
	}
	
	static float area(float r){
		return r * 3.14f;
	}
	
	public static void main(String[] args) {
		int l=4,b=5,s=5;
		float r = 7.0f;
		System.out.println("Area of a rectangle: " + area(l,b));
		System.out.println("Area of a square: " + area(s));
		System.out.println("Area of a circle: " + area(r));

	}

}
