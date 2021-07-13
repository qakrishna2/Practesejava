package variablestest.in;

public class Student {
	
	String studentNmae;
	int studentNumber;
    static String schoolNmae="ABC";

	public static void main(String[] args) {
		Student st=new Student();
		st.studentNmae="A";
		st.studentNumber=101;
		
		System.out.println(st.schoolNmae);
		System.out.println(st.studentNmae);
		System.out.println(st.studentNumber);
		
		
		Student st1=new Student();
		st1.studentNmae="B";
		st1.studentNumber=102;
		//st1.schoolNmae="public";
		
		System.out.println(st1.schoolNmae);
		System.out.println(st1.studentNmae);
		System.out.println(st1.studentNumber);
	}

}
