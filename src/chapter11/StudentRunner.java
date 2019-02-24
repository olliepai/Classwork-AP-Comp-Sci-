package chapter11;

public class StudentRunner {
	public static void main(String[] args) {
		Student s1 = new Student("Mathilda");
		Student s2 = new Student("Jose");
		
		System.out.println(s1.getName());
		
		Student.setSchoolName("Jorge");
		
		System.out.println(Student.getSchoolName());
	}
}
