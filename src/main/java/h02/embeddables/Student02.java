package h02.embeddables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student02 {
	
	@Id
	private int std_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	private Course course;
	
	
	public Student02() {
		
	}

	public Student02(int std_id, String name) {
		
		this.std_id = std_id;
		this.name = name;
	}

	public Student02(int std_id, String name, int grade) {
		
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
	}

	public Student02(int std_id, String name, int grade, Course course) {
		
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.course = course;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student02 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}


	
	
	
	

}
