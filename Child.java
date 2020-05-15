package week1;

public class Child extends ParentClass{
	String name = "ChildName";
	Long aadharNumber;
	
	public Child(String parentName,String name,Long aadharNumber){
		super(parentName);
		this.name = name;
		this.aadharNumber = aadharNumber;
	}
	public Child(){
		
	}
	
	static{
		System.out.println("This is a static block inside Child Class");
	}
	
	public void getName() {
		System.out.println("Child's Name: " + name);
		System.out.println("Parent's Name: " + super.name);
	}
	
	public Long getAadharNumber(){
		return aadharNumber;
	}
	
	static void performDowncasting(ParentClass a){
		Child b = (Child)a;
		System.out.println("Downcasting Done");
	}
	
	@Override
	public String getDescription(){
		return("This is Child Class");
		
	}
	
//	@Override                               //Just to show final method can't be overridden
//	public final void getAge(){
//		System.out.println("This is Child's Age");
//	}
	
}
