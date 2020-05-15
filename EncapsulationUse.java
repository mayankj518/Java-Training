package week1;

public class EncapsulationUse {

	public static void main(String[] args) {
		Encapsulation en = new Encapsulation(123,"Raj");
		en.setEmployeeid(10);
		en.setName("Mayank");
		System.out.println(en.getEmployeeid() + " " + en.getName());
	}

}
