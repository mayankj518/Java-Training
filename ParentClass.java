package week1;

public class ParentClass {
	String name = "ParentName";
	Long aadharNumber = 456455456458L;
	public ParentClass(String name){
		this.name = name;
	}
	
	public ParentClass(){
		
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	
	public String getDescription(){
		return("This is Parent Class");
	}
	
	public final void getAge (){
		System.out.println("This will Tell Parent's Age. This is a final method so can't be overridden");
	}
}
