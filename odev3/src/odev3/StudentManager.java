package odev3;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("��renci eklendi :" + user.getUsername());
	}

	@Override
	public void addCourse(User user,int courseId) {
		System.out.println("Kursa ��renci eklendi");
	}
}
