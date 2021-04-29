package odev3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setUsername("engindemirog");
		instructor1.setPassword("12345");
		instructor1.setCoverLetter("12 yıllık tecrübe");
		
		Student student1=new Student();
		student1.setId(2);
		student1.setUsername("ardaatay");
		student1.setPassword("56789");
		student1.setStudentNumber("768");		
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.addCourse(student1, 1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addCourse(instructor1, 1);
	}

}
