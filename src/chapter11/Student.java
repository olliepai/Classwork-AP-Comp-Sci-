package chapter11;

public class Student {
	private String name;
	private static String schoolName;
	
	public Student(String n) {
		name = n;
		schoolName = "Parker";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public static String getSchoolName() {
		return schoolName;
	}
	
	public static void setSchoolName(String n ) {
		schoolName = n;
	}
}
