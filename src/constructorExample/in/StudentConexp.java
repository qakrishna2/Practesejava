package constructorExample.in;

public class StudentConexp {
	
	StudentConexp(String name,int id)
	{
		System.out.println(name+" "+id);
	}
	public static void main(String[] args) {
		StudentConexp st=new StudentConexp("java", 10);
		StudentConexp st1=new StudentConexp("main", 11);
	}
}
