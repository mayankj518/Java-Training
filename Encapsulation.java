package week1;

public class Encapsulation {
	private int employeeid;
	private String name;
	
	public Encapsulation(){
		
	}
	public Encapsulation(int employeeid,String name){
		this.employeeid = employeeid;
		this.name = name;
	}
		
	public int getEmployeeid(){
		return employeeid;
	}
	
	public String getName(){
		return name;
	}
	
	public void setEmployeeid(int employeeid){
		this.employeeid = employeeid;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
