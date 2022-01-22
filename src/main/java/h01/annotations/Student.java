package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity //@Entity annotation i ise Elinizdeki Objeyi Database table ina donusturur.
@Table(name="Student_Table") //@Table annotation'i elinizdeki Objeye Database de yeni isim vermeniz saglar
public class Student {

	
	
	/*
	 * POJO: Plain Old Java Object
	 * private variables / instances
	 * constructors with / without params
	 * getters ve setters 
	 * toString
	 */
	
	@Id // @ID annotation elinizdeki table icin bu variable i primary key e donusturur
	private int std_id;
	//student_name
	@Column(name="student_name") // @Column annotation sizin variable inizi database de yeniden isimlendirmenize yardimci olur
	private String name;
	
	private int grade;
	@Transient //bu annotation variablellarinizi database icin disable etmenizi saglar yani database de bu ozellik kullanilmaz
	private String email;
	
	
	public Student() {
		
	}


	public Student(int std_id, String name, int grade) {
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [std_id: " + std_id + ", student name: " + name + ",student grade: " + grade + "]";
	}
	
	
	
	
	
	
	
}
