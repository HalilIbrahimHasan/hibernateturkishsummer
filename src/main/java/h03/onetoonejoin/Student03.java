package h03.onetoonejoin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student03 {
	
	
	@Id
	private int std_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	
	@OneToOne(mappedBy="student") //mappedBy diger class objesi ile bu class arasinda iliski kurar 
	private Dairy dairy;
	
	public Student03() {
	
	}


	public Student03(int std_id, String name, int grade, Dairy dairy) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.dairy = dairy;
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


	public Dairy getDairy() {
		return dairy;
	}


	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}


	@Override
	public String toString() {
		return "Student03 std_id: " + std_id + ", name: " + name + ", grade: " + grade + ", dairy: " + dairy ;
	}


	
	
	
	
	
	

}
