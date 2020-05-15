package week1;

public class InheritanceMain {

	public static void main(String[] args) {
		Child c = new Child("Raj","Rahul",123456789123L);
		c.getName();
		System.out.println(c.getAadharNumber());
		System.out.println(c.getDescription()); // Method Overriding
		c.getAge();                             // Final Keyword Concept
		
		ParentClass p = new ParentClass();
		System.out.println(p.getDescription()); 
		// To show that Method which was Overridden is still there. 
		
		ParentClass upcast =  new Child();
		System.out.println(upcast.getDescription()); // Runtime polymorphism
		
		ParentClass downcast = new Child();
		Child.performDowncasting(downcast);
		
	}

}
