package week1;

public class Strings {

	public static void main(String[] args) {
//		String
		String str = "abcdefgh";
		str = str.substring(0,1);
		String s = "abcdefgh";
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.substring(1,6));
		System.out.println(str.substring(3));
		System.out.println(str.substring(0,str.length()));
		System.out.println(str.contains("cde"));
		System.out.println(s.indexOf('i'));
		System.out.println(s.toUpperCase());
		System.out.println(str.equals(s));
		System.out.println(s==str);
		
		
//		StringBuilder
		StringBuilder a = new StringBuilder("abcdcba");
		System.out.println(a.length());
		String b = a.toString();
		String c = a.reverse().toString();
		if(c.equals(b)) System.out.println("palindrome");
		
		String name = new String("abcdefgh");
		String lastName = "abcdefgh";
		String firstName = new String("abcdefgh");
		String middleName = "abcdefgh";
		
		StringBuffer sb = new StringBuffer("abcdefgh");
		
	}

}
