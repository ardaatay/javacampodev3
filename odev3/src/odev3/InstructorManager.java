package odev3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("��retmen eklendi :" + user.getUsername());
	}

	@Override
	public void addCourse(User user,int courseId) {
		System.out.println("Kursa ��retmen eklendi");
	}
}
