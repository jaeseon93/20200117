package co.two.lecture.dto;

public class ProfessorDto {
	private String professor_code;
	private String professor_name;
	private String professor_dept;

	public ProfessorDto() {

	}

	public String getProfessor_code() {
		return professor_code;
	}

	public String getProfessor_name() {
		return professor_name;
	}

	public String getProfessor_dept() {
		return professor_dept;
	}

	public void setProfessor_code(String professor_code) {
		this.professor_code = professor_code;
	}

	public void setProfessor_name(String professor_name) {
		this.professor_name = professor_name;
	}

	public void setProfessor_dept(String professor_dept) {
		this.professor_dept = professor_dept;
	}

}
