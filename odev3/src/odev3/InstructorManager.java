package odev3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Öğretmen eklendi :" + user.getUsername());
	}

	@Override
	public void addCourse(User user,int courseId) {
		System.out.println("Kursa öğretmen eklendi");
	}
}
