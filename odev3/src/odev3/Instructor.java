package odev3;

public class Instructor extends User {
	private String coverLetter;
	
	public Instructor() {
		
	}

	public Instructor(String coverLetter) {
		super();
		this.coverLetter = coverLetter;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
}
