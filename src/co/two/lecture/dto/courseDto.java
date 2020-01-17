package co.two.lecture.dto;

public class courseDto {
	private int course_id;
	private String professor_code;
	private String subject_code;
	private String lacture_room;

	public courseDto() {
	}

	public int getCourse_id() {
		return course_id;
	}

	public String getProfessor_code() {
		return professor_code;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public String getLacture_room() {
		return lacture_room;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public void setProfessor_code(String professor_code) {
		this.professor_code = professor_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public void setLacture_room(String lacture_room) {
		this.lacture_room = lacture_room;
	}

}
