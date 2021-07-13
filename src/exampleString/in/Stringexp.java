package exampleString.in;

public class Stringexp {

	public static void main(String[] args) {
		
		String s=" Automation,main,length ";
		String s2="Automation";
		String s1=new String("Automation");
		
		s.toUpperCase();
		System.out.println(s2.equals(s1));
		System.out.println(s2==s1);
		System.out.println(s.toCharArray());
		System.out.println(s.substring(0));
		System.out.println(s.substring(2,4));
		System.out.println(s.contains("gth"));
		System.out.println(s.concat("tool"));
		System.out.println(s.trim().length());
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		System.out.println(s.substring(2));
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(6));
		String ss=s.split(",")[1];
		System.out.println(ss);
		System.out.println("-----------");
		
		String[] array=s.split(",");
		for(String a: array)
			System.out.println(a);
	}

}
