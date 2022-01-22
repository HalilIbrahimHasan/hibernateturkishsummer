package h03.onetoonejoin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dairy {
	
	@Id
	private int dairy_id;
	@Column(name="dairy_name")
	private String name;
	@OneToOne
	@JoinColumn(name="std_id") // Parent class in primary key i ile child class arasinda iliski kurulur
	private Student03 student;
	
	
	public Dairy() {
	}

	public Dairy(int dairy_id, String name) {
		
		this.dairy_id = dairy_id;
		this.name = name;
	}

	public int getDairy_id() {
		return dairy_id;
	}

	public void setDairy_id(int dairy_id) {
		this.dairy_id = dairy_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student03 getStudent() {
		return student;
	}

	public void setStudent(Student03 student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Dairy dairy_id=" + dairy_id + ", name=" + name ;
	}

	
	
	
	
	
	

}
